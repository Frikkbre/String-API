package commands;
/**
 * ReplaceTextCommand
 */
public class ReplaceTextCommand implements TextCommand{
  private final String target;
  private final String replacement;
/**
 * Constructor for the ReplaceTextCommand
 */
  public ReplaceTextCommand(String target, String replacement){
    this.target = target;
    this.replacement = replacement;
  }

  /**
   * Replaces the target string with the replacement string
   * @param text
   * @return
   */
  public String execute(String text){
    return replaceTextCommand(text, target, replacement);
  }

  /**
   * Replaces the target string with the replacement string
   * @param text
   * @param target
   * @param replacement
   * @return
   */
  public String replaceTextCommand(String text, String target, String replacement){
    if(text.contains(target)){
      return text.replace(target, replacement);
    }else{
      //System.out.println("Target was not found in the given text");
      throw new IllegalArgumentException("Target was not found in the given text");
    }
  }

  /**
   * Getter for the target string
   * @return
   */
  public String getTarget(){
    return target;
  }

  /**
   * Getter for the replacement string
   * @return
   */
  public String getReplacement(){
    return replacement;
  }
}
