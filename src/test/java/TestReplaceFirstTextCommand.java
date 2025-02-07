import commands.ReplaceFirstTextCommand;
import commands.ReplaceTextCommand;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestReplaceFirstTextCommand {

  @Test
  public void TestReplaceFirstText(){
    ReplaceFirstTextCommand replace = new ReplaceFirstTextCommand("text","replaced");
    String result = replace.execute("This is a text text but only the first text is replaced!");
    assertEquals("This is a replaced text but only the first text is replaced!", result);
  }

  @Test
  public void TestReplaceFirstTextNegative(){
    ReplaceFirstTextCommand replace = new ReplaceFirstTextCommand("text","replaced");
    assertThrows(IllegalArgumentException.class, () ->
        replace.execute("This does not include the target word....")
    );
  }

}