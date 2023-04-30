package ast.node;

import java.util.ArrayList;
import java.util.List;


public class Class extends Node {

    private final String extendsTo;
    private final String className;

    private final List<Object> children;

    public Class(int lineNumber, String extendsTo, String className) {
        nodeName = "class";
        this.lineNumber = lineNumber;
        this.extendsTo = extendsTo;
        this.className = className;
        children = new ArrayList<>();
    }

    public void addChild(Object child) {
        children.add(child);
    }

    StringBuilder childrenToString(List<Object> children) {
        StringBuilder rc = new StringBuilder();
        for (Object child : children) {

            rc.append(child).append("\n\n");
        }
        return rc;
    }

    @Override
    public String toString() {
        return " *** " + nodeName + " at line " + lineNumber + ", its name is " + className + ", extendsTo " + extendsTo
                + " and its children are \n\n" + childrenToString(children) + " *** \n";
    }


}
