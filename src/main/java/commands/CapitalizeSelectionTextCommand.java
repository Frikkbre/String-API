package commands;

/**
 * CapitalizeSelectionTextCommand capitalizes a selection of the text defined by target variable
 * and returns the result.
 */
public class CapitalizeSelectionTextCommand {
  String target;

  public CapitalizeSelectionTextCommand(String target){
    this.target = target;
  }

  /**
   * Capitalizes the target word in the given text
   * @param text
   * @return
   */
  public String execute(String text) {
    if(text.isBlank()){
      throw new IllegalArgumentException("Text cannot be empty");
    }
    return text.replace(target, target.toUpperCase());
  }

}
