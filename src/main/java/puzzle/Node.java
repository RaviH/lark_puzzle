package puzzle;

import com.diogonunes.jcdp.color.ColoredPrinter;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

import static puzzle.Constants.*;

@AllArgsConstructor
@Data
public class Node {

    private String text;
    private int level;
    private boolean isButton;
    private List<Node> children = new ArrayList<>();
    @Setter(AccessLevel.NONE)
    private Node parent;

    /**
     * Create a node given the text, level and whether current line is a button or not.
     *
     * @param text     text for the button or line
     * @param level    level within the given tree
     * @param isButton is current text for button or line
     */
    public Node(String text, int level, boolean isButton) {

        this.text = text;
        this.level = level;
        this.isButton = isButton;
    }

    /**
     * Sets the parent node while adding current node to the children of parent node.
     *
     * @param parentNode parent node for current node.
     */
    public void setParent(Node parentNode) {

        this.parent = parentNode;
        parentNode.addChildren(this);
    }

    /**
     * Helper method for adding to current node's children.
     *
     * @param childNode child node.
     */
    public void addChildren(Node childNode) {

        children.add(childNode);
    }

    @Override
    public String toString() {

        return "text: " + this.text + ", level: " + this.level;
    }

    /**
     * Is current node invalid is based on whether it's a line or button.
     *
     * @return true if invalid
     */
    public boolean isInvalid() {

        if (isButton) {
            return text.length() > 20;
        } else {
            return text.length() > 100 || children.size() > 3;
        }
    }

    /**
     * Helper function to print a line given a color.
     */
    public void printLine() {

        System.out.println(getColor() + this.text + ANSI_RESET);
        for (Node node : children) {
            node.printLine();
        }
    }

    /**
     * Uses JCDP library for printing text with a certain background and foreground color.
     * Recursively prints the current node's line and then it's children.
     */
    public void printLineWithColorPrinter() {

        getColorPrinter().println(this.text);
        for (Node node : children) {
            node.printLineWithColorPrinter();
        }
    }

    /**
     * Get the color for current node given if it's valid / invalid, is a button / line.
     *
     * @return color red/green/black
     */
    private String getColor() {

        if (isInvalid()) {
            return ANSI_RED;
        } else {
            if (isButton) {
                return ANSI_GREEN;
            } else {
                return ANSI_BLACK;
            }
        }
    }

    /**
     * Get the color for current node given if it's valid / invalid, is a button / line.
     *
     * @return color red/green/black
     */
    public ColoredPrinter getColorPrinter() {

        if (isInvalid()) {
            return ERROR;
        } else {
            if (isButton) {
                return GOOD_BUTTON;
            } else {
                return GOOD_LINE;
            }
        }
    }

}
