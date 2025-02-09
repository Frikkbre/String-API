package commands;

/**
 * CapitalizeWordsTextCommand
 */
public class CapitalizeWordsTextCommand implements TextCommand{
  public CapitalizeWordsTextCommand(){
  }

  /**
   * Capitalizes all the words in the given text
   * @param text
   * @return
   */
  @Override
  public String execute(String text) {
    if(text.isBlank()){
      throw new IllegalArgumentException("Text cannot be empty");
    }
    return text.toUpperCase();
  }
}
