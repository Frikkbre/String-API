import commands.CapitalizeWordsTextCommand;
import commands.ReplaceFirstTextCommand;
import commands.ReplaceTextCommand;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCapitalizeWordsTextCommand{

  @Test
  public void TestCapitalizeWordsTextCommand(){
    CapitalizeWordsTextCommand word = new CapitalizeWordsTextCommand();
    String result = word.execute("capitalize each first letter");
    assertEquals("Capitalize Each First Letter", result);
  }

  @Test
  public void TestCapitalizeWordsTextCommandNegative(){
    CapitalizeWordsTextCommand word = new CapitalizeWordsTextCommand();
    assertThrows(IllegalArgumentException.class, () ->
        word.execute("")
    );
  }
}
