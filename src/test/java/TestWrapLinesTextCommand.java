import commands.WrapLinesTextCommand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestWrapLinesTextCommand {
    @Test
    public void TestWrapLinesTextCommand(){
        WrapLinesTextCommand wrap = new WrapLinesTextCommand("Start","End");
        String result = wrap.execute("Test Line 1\nTest Line 2\nTest Line 3");
        assertEquals("StartTest Line 1End\nStartTest Line 2End\nStartTest Line 3End", result);
    }


    @Test
    public void TestWrapTextCommandNegative(){
        WrapLinesTextCommand wrap = new WrapLinesTextCommand("Start","End");
        assertThrows(IllegalArgumentException.class, () ->
                wrap.execute("")
        );
    }
}
