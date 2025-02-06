import commands.ReplaceTextCommand;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestReplaceTextCommand {

  @Test
  public void testReplaceText() {
    ReplaceTextCommand replace = new ReplaceTextCommand();
    String result = replace.replaceTextCommand("This is a text", "text", "replaced text");
    assertEquals("This is a replaced text", result);
  }

  @Test
  public void testNoReplacement() {
    ReplaceTextCommand replace = new ReplaceTextCommand();
    assertThrows(IllegalArgumentException.class, () ->
        replace.replaceTextCommand("This is a text", "fish", "fishes")
    );
    }
  }