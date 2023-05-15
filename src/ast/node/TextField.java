package ast.node;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TextField extends Node {

    private final List<Object> children;

    String id;
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

    public String getId() {

        return id;
    }
    @Override
    public String toHtml(List<String> content) {


        return null;
    }
    @Override
    public String toString() {
        return nodeName + " at line " + lineNumber + " and its children are " + children;
    }

    @Override
    public String toHtml(String content) {


        StringBuilder sb = new StringBuilder();


        id = children.get(0).toString().split("is")[2].split("=")[0];

        sb.append("<input id=\"").append(id).append("_input\"");
        if (Objects.equals(id, " password")) {

            sb.append(" type=\"password\" placeholder=\"enter your ").append(id).append("\">");

        }
        else {

            sb.append(" type=\"text\" placeholder=\"enter your ").append(id).append("\">");

        }

       return  sb.toString();
    }
}
