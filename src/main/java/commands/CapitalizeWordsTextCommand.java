package commands;

public class CapitalizeWordsTextCommand implements TextCommand{
  public CapitalizeWordsTextCommand(){
  }

  @Override
  public String execute(String text) {
    if(text.isBlank()){
      throw new IllegalArgumentException("Text cannot be empty");
    }
    return text.toUpperCase();
  }
}
