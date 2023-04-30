package ast.node;

public class Doublee extends Node {

    private final double value;

    Doublee(int lineNumber, Node leftMostChild, Node sibling, Node parent, double value) {
        nodeName = "Double";
        this.lineNumber = lineNumber;

        this.value = value;
    }

    @Override
    public String toString() {
        return value + " ";
    }
}
