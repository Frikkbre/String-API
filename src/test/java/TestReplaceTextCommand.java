import commands.ReplaceTextCommand;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestReplaceTextCommand {

  @Test
  public void testReplaceText() {
    ReplaceTextCommand replace = new ReplaceTextCommand("text", "replaced text");
    String result = replace.execute("This is a text");
    assertEquals("This is a replaced text", result);
  }

  @Test
  public void testNoReplacement() {
    ReplaceTextCommand replace = new ReplaceTextCommand("fish", "cat");
    assertThrows(IllegalArgumentException.class, () ->
        replace.execute("This is a text")
    );
    }
  }