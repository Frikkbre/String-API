package commands;

public class ReplaceTextCommand implements TextCommand{
  private final String target;
  private final String replacement;

  public ReplaceTextCommand(String target, String replacement){
    this.target = target;
    this.replacement = replacement;
  }

  public String execute(String text){
    return replaceTextCommand(text, target, replacement);
  }

  public String replaceTextCommand(String text, String target, String replacement){
    if(text.contains(target)){
      return text.replace(target, replacement);
    }else{
      //System.out.println("Target was not found in the given text");
      throw new IllegalArgumentException("Target was not found in the given text");
    }
  }


  public String getTarget(){
    return target;
  }

  public String getReplacement(){
    return replacement;
  }
}
