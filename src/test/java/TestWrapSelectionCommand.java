import commands.WrapSelectionTextCommand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestWrapSelectionCommand {
    @Test
    public void TestWrapSelectionCommand(){
        WrapSelectionTextCommand wrap = new WrapSelectionTextCommand("this section","THIS SELECTION","IS WRAPPED");
        String result = wrap.execute("This is a text and i shall wrap this section in this text");
        assertEquals("This is a text and i shall wrap THIS SELECTION this section IS WRAPPED in this text", result);
    }


    @Test
    public void TestWrapTextCommandNegative(){
        WrapSelectionTextCommand wrap = new WrapSelectionTextCommand("this section","THIS SELECTION","IS WRAPPED");
        assertThrows(IllegalArgumentException.class, () ->
                wrap.execute("")
        );
    }
}
