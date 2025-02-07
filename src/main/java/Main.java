import commands.ReplaceTextCommand;

public class Main {

  public static void main(String[] args) {
    ReplaceTextCommand replace = new ReplaceTextCommand("Frikk", "Aoife");
    replace.execute("Hei jeg heter Frikk");
  }
}
