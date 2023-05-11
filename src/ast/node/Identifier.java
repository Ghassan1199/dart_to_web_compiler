package ast.node;


import java.util.List;

public class Identifier extends Node {

    private final String child;

    Identifier(int lineNumber, String child) {
        nodeName = "Identifier";
        this.lineNumber = lineNumber;

        this.child = child;
    }

    @Override
    public String toString() {
        return nodeName + " at line " + lineNumber + " and its child is " + child;
    }

    @Override
    public String toHtml(List<String> content) {


        return null;
    }
    @Override
    public String toHtml(String content) {
        return null;
    }
}
