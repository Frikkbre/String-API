import commands.CapitalizeWordsTextCommand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestCapitalizeWordsTextCommand {
  @Test
  public void TestCapitalizeWordsTextCommand(){
    CapitalizeWordsTextCommand word = new CapitalizeWordsTextCommand();
    String result = word.execute("Capitalize this text");
    assertEquals("CAPITALIZE THIS TEXT", result);
  }

  @Test
  public void TestCapitalizeWordsTextCommandNegative(){
    CapitalizeWordsTextCommand word = new CapitalizeWordsTextCommand();
    assertThrows(IllegalArgumentException.class, () ->
        word.execute("")
    );
  }
}
