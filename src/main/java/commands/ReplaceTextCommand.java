package commands;

public class ReplaceTextCommand extends TextCommand{
  private String target;
  private String replacement;


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
