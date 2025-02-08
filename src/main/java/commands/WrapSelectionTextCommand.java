package commands;

/**
 * This class is a subclass of WrapTextCommand and it wraps a gived selection text.
 * it uses a attribute for the selcetion thats to be wrapped.
 * uses a constructor to tak in the nescessary paramters and aksessor method getSelection to get the selection.
 */
public class WrapSelectionTextCommand extends WrapTextCommand{
    private String selection;

    public WrapSelectionTextCommand(String selection, String wrap) {
        super(wrap);
        this.selection = selection;
    }

    public String getSelection() {
        return selection;
    }

    public String execute() {
        return wrap + selection + wrap;
    }
}
