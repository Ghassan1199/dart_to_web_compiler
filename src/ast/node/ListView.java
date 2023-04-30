package ast.node;

import java.util.ArrayList;
import java.util.List;

public class ListView extends Node {
    private final List<Object> children;

   private String padding;
    public ListView(int lineNumber, String padding) {
        nodeName = "ListView";
        this.lineNumber = lineNumber;
        this.padding = padding;
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
        return nodeName + " at line" + lineNumber + ", padding is "+ padding + " and its children are \n" + childrenToString(children);

    }

}
