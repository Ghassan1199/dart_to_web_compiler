package ast.node;


import java.util.List;

public class RunApp extends Node {

    private final Object child;

    public RunApp(int lineNumber, Object child) {
        nodeName = "RunApp";
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
