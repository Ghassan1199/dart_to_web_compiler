package ast.node;


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


}
