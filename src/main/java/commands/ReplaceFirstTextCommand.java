package commands;

public class ReplaceFirstTextCommand extends ReplaceTextCommand {
  public ReplaceFirstTextCommand(String target, String replacement) {
    super(target, replacement);
  }

  /**
   * Replaces the first occurrence of the target string in the given text with the replacement string.
   * @param text
   * @param target
   * @param replacement
   * @return text with the first occurrence of the target string replaced with the replacement string
   */
  @Override
  public String replaceTextCommand(String text, String target, String replacement) {
    if (text.contains(target)) {
      return text.replaceFirst(target, replacement);
    } else {
      throw new IllegalArgumentException("Target was not found in the given text");
    }
  }
}
