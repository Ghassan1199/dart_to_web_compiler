package ast.node;

import java.util.List;

public class Button extends Node{



    private final Object onTap;
    private final Object child;

    public Button(int lineNumber, Object onTap, Object child) {
        nodeName = "Button";
        this.lineNumber = lineNumber;
        this.onTap = onTap;
        this.child = child;
    }

    @Override
    public String toString() {
        return  nodeName + " and its child is " + child + " and onPressed is " + onTap;
    }

    @Override
    public String toHtml(String content) {

        String text = "";
        if (child != null) {
            String child1 = child.toString();
            text = child1.substring(34,child1.length() - 1);

        }
        StringBuilder sb = new StringBuilder();

        sb.append("<button onclick=\"nav()\">\n");

        sb.append(text);

        sb.append("\n</button>");

        return sb.toString();
    }
    @Override
    public String toHtml(List<String> content) {


        return null;
    }
}
