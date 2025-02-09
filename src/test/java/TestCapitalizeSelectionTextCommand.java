import commands.CapitalizeSelectionTextCommand;

import commands.ReplaceFirstTextCommand;
import commands.ReplaceTextCommand;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCapitalizeSelectionTextCommand {
  @Test
  public void TestCapitalizeWordsTextCommand(){
    CapitalizeSelectionTextCommand word = new CapitalizeSelectionTextCommand("this");
    String result = word.execute("Capitalize this text");
    assertEquals("Capitalize THIS text", result);
  }

  @Test
  public void TestCapitalizeWordsTextCommandNegative(){
    CapitalizeSelectionTextCommand word = new CapitalizeSelectionTextCommand("this");
    assertThrows(IllegalArgumentException.class, () ->
        word.execute("")
    );
  }
}
