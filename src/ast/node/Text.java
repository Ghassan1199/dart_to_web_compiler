package ast.node;



public class Text extends Node {

    private final Object child;

    public Text(int lineNumber, String child) {
        nodeName = "Text";
        this.lineNumber = lineNumber;
        this.child = child;
    }

    @Override
    public String toString() {
        return nodeName + " at line " + lineNumber + " and its child is " + child;
    }
}
