package commands;

/**
 * This class is a subclass of WrapTextCommand
 * it wraps every line of a given text.
 * it uses a constructor to take in opening and end wrap.
 */
public class WrapLinesTextCommand extends WrapTextCommand {

    public WrapLinesTextCommand(String opening, String end) {
        super(opening, end);
    }

    /**
     * Wraps every line of the given text with the opening and end strings
     * @param text
     * @return the wrapped text
     */
    @Override
    public String execute(String text) {
        if (text == null || text.isBlank()) {
            throw new IllegalArgumentException("Text cannot be null or blank");
        }
        String[] lines = text.split("\n");
        StringBuilder wrappedText = new StringBuilder();
        for (String line : lines) {
            wrappedText.append(opening).append(line).append(end).append("\n");
        }
        return wrappedText.toString().trim();
    }
}