package ast.node;


import java.util.ArrayList;
import java.util.List;

public class Column extends Node {
    private final List<Object> children;


    public Column(int lineNumber) {
        nodeName = "Column";
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


}
