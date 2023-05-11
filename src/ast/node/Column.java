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

    @Override
    public String toHtml(List<String> ids) {
        StringBuilder sb = new StringBuilder();
        sb.append("<script>\n");
        sb.append("const urlParams = new URLSearchParams(window.location.search);\n");

        for (String id : ids) {
            sb.append("const ").append(id).append(" = urlParams.get(\'").append(id).append("\');\n");
            sb.append("document.getElementById(\'").append(id).append("\').textContent = ").append(id).append(";\n");
        }
        sb.append("\n</script>");

        return sb.toString();


    }
    @Override
    public String toHtml(String content) {
        return null;
    }
}
