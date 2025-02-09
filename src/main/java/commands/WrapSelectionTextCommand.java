package commands;

/**
 * This class is a subclass of WrapTextCommand and it wraps a gived selection text.
 * it uses a attribute for the selcetion thats to be wrapped.
 * uses a constructor to tak in the nescessary paramters and aksessor method getSelection to get the selection.
 */
public class WrapSelectionTextCommand extends WrapTextCommand{
    private String selection;
    private String opening;
    private String end;

    /**
     * Constructor that takes in the selection, opening and end strings.
     * @param selection
     * @param opening
     * @param end
     */
    public WrapSelectionTextCommand(String selection, String opening, String end) {
        super(opening, end);
        this.selection = selection;
        //super(opening, end);
        this.opening = opening;
        this.end = end;

    }

    /**
     * Getter for the selection string
     * @return
     */
    public String getSelection() {
        return selection;
    }

    /**
     * Wraps the selection string with the opening and end strings
     * @param text
     * @return
     */
    public String execute(String text) {
        if (text == null || text.isBlank()) {
            throw new IllegalArgumentException("Text cannot be null or blank");
        }
        if (selection == null || selection.isBlank()) {
            throw new IllegalArgumentException("Selection cannot be null or blank");
        }
        if (!text.contains(selection)) {
            throw new IllegalArgumentException("Selection not found in text");
        }
        return text.replace(selection, opening + " " + selection + " " + end);
    }
}