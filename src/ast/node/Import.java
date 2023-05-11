package ast.node;

import java.util.List;

public class Import extends Node {

    private final String child;

    public Import(int lineNumber, String child) {
        nodeName = "import";
        this.lineNumber = lineNumber;
        this.child = child;
    }

    @Override
    public String toString() {
        return " *** " + nodeName +
                " at line " + lineNumber + ", imported package is " + child + " *** \n";
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
