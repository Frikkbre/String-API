import commands.CapitalizeTextCommand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Test for CapitalizeTextCommand
 */
public class TestCapitalizeTextCommand {
  @Test
  public void TestCapitalizeWordsTextCommand(){
    CapitalizeTextCommand word = new CapitalizeTextCommand();
    String result = word.execute("Capitalize this text");
    assertEquals("CAPITALIZE THIS TEXT", result);
  }

  @Test
  public void TestCapitalizeWordsTextCommandNegative(){
    CapitalizeTextCommand word = new CapitalizeTextCommand();
    assertThrows(IllegalArgumentException.class, () ->
        word.execute("")
    );
  }
}
