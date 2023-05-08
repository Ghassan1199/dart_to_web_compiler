package ast.node;

import java.util.ArrayList;
import java.util.List;

public class TextField extends Node {

    private List<Object> children;

    public TextField(int lineNumber) {
        nodeName = "TextFormField";
        this.lineNumber = lineNumber;
        this.children = new ArrayList<>();

    }

    public List<Object> getChildren() {
        return children;
    }

    public void setChild(Object child) {
        this.children.add(child);
    }

    @Override
    public String toString() {
        return nodeName + " at line " + lineNumber + " and its children are " + children;
    }
}
