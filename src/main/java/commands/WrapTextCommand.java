package commands;

public class WrapTextCommand implements TextCommand {
  String opening;
  String end;

  public WrapTextCommand(String opening, String end){
    this.opening = opening;
    this.end = end;
  }

  /**
   * Wraps the given text with the opening and end strings
   * @param text
   * @return the wrapped text
   */
  @Override
  public String execute(String text) {
    if (text == null || text.isBlank()) {
      throw new IllegalArgumentException("Text cannot be null");
    } else {
      return opening + " " + text + " " + end;
    }
  }
}
