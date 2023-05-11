package ast.node;

import java.util.ArrayList;
import java.util.List;

public class Row extends Node {

    private final List<Object> children;


    public Row(int lineNumber) {
        nodeName = "Row";
        this.lineNumber = lineNumber;
        this.children = new ArrayList<>();

    }

    public void addChild(Object child) {
        children.add(child);
    }

    StringBuilder childrenToString(List<Object> children) {
        StringBuilder rc = new StringBuilder();
        for (Object child : children) {

            rc.append(child).append("\n");
        }
        return rc;
    }

    @Override
    public String toString() {
        return nodeName + " at line " + lineNumber + " and its children are \n" + childrenToString(children);
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
