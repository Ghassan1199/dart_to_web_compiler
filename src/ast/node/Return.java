package ast.node;


import java.util.List;

public class Return extends Node {

    private final Object child;

    public Return(int lineNumber, Object child) {
        nodeName = "return";
        this.lineNumber = lineNumber;
        this.child = child;
    }

    @Override
    public String toString() {
        return " *** " + nodeName + " at line " + lineNumber + " and its child is " + child + " *** \n";
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
