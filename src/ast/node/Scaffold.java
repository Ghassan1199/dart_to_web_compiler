package ast.node;


import java.util.List;

public class Scaffold extends Node {
    private final Object child;

    public Scaffold(int lineNumber, Object child) {
        nodeName = "Scaffold";
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
    public String toHtml(String content)
    {
        StringBuilder sb = new StringBuilder();

        sb.append("<body>\n");

        sb.append(content);

        sb.append("\n</body>");

        return sb.toString();


    }
}
