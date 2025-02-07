package commands;

public class ReplaceFirstTextCommand extends ReplaceTextCommand {
  public ReplaceFirstTextCommand(String target, String replacement) {
    super(target, replacement);
  }

  @Override
  public String replaceTextCommand(String text, String target, String replacement) {
    if (text.contains(target)) {
      return text.replaceFirst(target, replacement);
    } else {
      throw new IllegalArgumentException("Target was not found in the given text");
    }
  }
}
