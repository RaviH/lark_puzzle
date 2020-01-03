package puzzle;

import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

@Slf4j
public class LarkPuzzle {

    public static void main(String[] args) {

        new LarkPuzzle().printLine(Constants.NICE_VALID_INPUT);
    }

    public void printLine(String inputString) {

        createTree(inputString)
                .ifPresent(Node::printLineWithColorPrinter);
    }

    /**
     * Simply create a tree structure based on the given input using new line as a way to determine move to next level.
     * Use tab count to determine current level (root node is at level 0 since it will have 0 tabs to start with).
     *
     * @param inputString input string
     * @return a completely formed tree.
     */
    private Optional<Node> createTree(final String inputString) {

        if (inputString == null || inputString.trim().isEmpty()) {
            return Optional.empty();
        }

        String[] lines = inputString.split("\\r?\\n");

        Node currNode;
        Node rootNode = null;
        Node prevNode = null;

        for (int i = 0; i < lines.length; i++) {
            String currLine = lines[i];
            final int level = getLevel(currLine);
            final boolean isButton = isButton(currLine);
            currNode = new Node(currLine, level, isButton);
            if (i == 0) {
                rootNode = currNode;
            } else {

                // If the level of previous node was less than current node,
                // then we know the parent node of current node.
                if (prevNode.getLevel() < level) {
                    currNode.setParent(prevNode);
                } else {
                    // if we get to a new button, then we might need to figure out the parent of current node,
                    // which might be many levels up.
                    // We want to find the last child added at current level - 1.
                    final Node parentNode = findNodeAtLevel(level - 1, rootNode);
                    currNode.setParent(parentNode);
                }
            }

            prevNode = currNode;
        }
        return Optional.of(rootNode);
    }

    /**
     * Helper function for finding a node at a given level, starting at root node.
     * This is important when we have to walk back multiple levels.
     *
     * @param level level at which to find the closest node.
     * @param node  node to start with.
     * @return
     */
    private Node findNodeAtLevel(int level, Node node) {

        if (node.getLevel() == level) {
            return node;
        } else {
            final int lastAddedChildNode = node.getChildren().size() - 1;
            return findNodeAtLevel(level, node.getChildren().get(lastAddedChildNode));
        }
    }

    /**
     * If current node's level returns 1 for modulo 2 then it's a button else it's a line.
     *
     * @param str current input string
     * @return true for button, false otherwise.
     */
    private boolean isButton(String str) {

        return getLevel(str) % 2 == 1;
    }

    /**
     * The level of current node depends on the number of tabs it has.
     *
     * @param str input string
     * @return counts the number of tabs current string has.
     */
    private int getLevel(String str) {

        int numTabs = 0;
        for (char c : str.toCharArray()) {

            if ("\t".equals("" + c)) {
                numTabs++;
            }
        }
        return numTabs;
    }
}
