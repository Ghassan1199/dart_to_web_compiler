package ast.node;

import java.util.List;

public class Integer extends Node {

    private final int value;

    Integer(int lineNumber, Node leftMostChild, Node sibling, Node parent, int value) {
        nodeName = "Integer";
        this.lineNumber = lineNumber;

        this.value = value;
    }
    @Override
    public String toHtml(List<String> content) {


        return null;
    }
    @Override
    public String toString() {
        return value + " ";
    }

    @Override
    public String toHtml(String content) {
        return null;
    }
}
