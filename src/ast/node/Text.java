package ast.node;


import java.util.List;

public class Text extends Node {

    private final Object child;


    public Text(int lineNumber, String child) {
        nodeName = "Text";
        this.lineNumber = lineNumber;
        this.child = child;
    }

    public Object getChild() {
        return child;
    }

    @Override
    public String toHtml(List<String> content) {


        return "NON";
    }
    @Override
    public String toString() {
        return nodeName + " at line " + lineNumber + " and its child is " + child;
    }

    @Override
    public String toHtml(String content) {

        String sb = "\n<p id=\"" + child + "\">" +
                child +
                "</p>\n";


        return sb;
    }
}
