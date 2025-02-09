package commands;

public class CapitalizeWordsTextCommand extends CapitalizeTextCommand{
  public CapitalizeWordsTextCommand(){
  }

  @Override
  public String execute(String text) {
    if (text.isBlank()) {
      throw new IllegalArgumentException("Text cannot be empty");
    }
    String[] words = text.split(" ");
    StringBuilder result = new StringBuilder();
    for (String word : words) {
      result.append(Character.toUpperCase(word.charAt(0)))
          .append(word.substring(1).toLowerCase())
          .append(" ");
    }
    return result.toString().trim();
  }
}
