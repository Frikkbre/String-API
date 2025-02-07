import commands.ReplaceFirstTextCommand;
import commands.ReplaceTextCommand;

import commands.WrapTextCommand;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestWrapTextCommand {
  @Test
  public void TestWrapTextCommand(){
    WrapTextCommand wrap = new WrapTextCommand("Hei!","MVH xxx xxxx");
    String result = wrap.execute("Dette er en jobb mail");
    assertEquals("Hei! Dette er en jobb mail MVH xxx xxxx", result);
  }


  @Test
  public void TestWrapTextCommandNegative(){
    WrapTextCommand wrap = new WrapTextCommand("Hei!","MVH xxx xxxx");
    assertThrows(IllegalArgumentException.class, () ->
        wrap.execute("")
    );
  }
}
