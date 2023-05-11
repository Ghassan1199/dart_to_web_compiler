package ast.node;

import java.util.List;

public class MaterialApp extends Node {


    private final Object child;

    public MaterialApp(int lineNumber, Object child) {
        nodeName = "MaterialApp";
        this.lineNumber = lineNumber;

        this.child = child;
    }

    @Override
    public String toHtml(List<String> content) {


        return null;
    }

    @Override
    public String toString() {
        return nodeName + " at line " + lineNumber + " and its child is " + child;
    }

    @Override
    public String toHtml(String content) {
        return null;
    }
}
