import commands.TextCommand;

import java.util.List;

/**
 * Created by Frikk Brændsrød on 2/9/125.
 * This class has a list of commands defined in its constructor
 * The mehod execute runs the commands in the list
 * the result from the first command is passed to the next command
 * returns the result from the last command
 */
public class Script implements TextCommand {
  private List<TextCommand> commands;

  public Script(List<TextCommand> commands){
    this.commands = commands;
  }

  @Override
  public String execute(String text){
    String result = text;
    for(TextCommand command : commands){
      result = command.execute(result);
    }
    return result;
  }
}
