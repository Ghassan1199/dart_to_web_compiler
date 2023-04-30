package ast.node;

public class Integer extends Node {

    private final int value;

    Integer(int lineNumber, Node leftMostChild, Node sibling, Node parent, int value) {
        nodeName = "Integer";
        this.lineNumber = lineNumber;

        this.value = value;
    }

    @Override
    public String toString() {
        return value + " ";
    }
}
