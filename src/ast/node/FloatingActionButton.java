package ast.node;

import java.util.List;

public class FloatingActionButton extends Node{



    private final Object onTap;
    private final Object child;

    static int n = 0;

    public FloatingActionButton(int lineNumber, Object onTap, Object child) {
        nodeName = "FloatingActionButton";
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
            text = child.toString();
            text = text.substring(8, text.length() - 2);

            if (text.equals("add")) {
                text = "+";
            }
            else {
                text = "-";
            }
        }

        StringBuilder sb = new StringBuilder();

        sb.append("<div style=\"position: fixed; bottom: 20px; right: 20px; z-index: 9999; background-color: #ff0000; color: #ffffff; border-radius: 50%; width: 60px; height: 60px; text-align: center; line-height: 60px; font-size: 20px; cursor: pointer;\">\n");

        sb.append(text);

        sb.append("\n</div>");
        n++;

        if (n > 2) {
            return "";
        }

        return sb.toString();
    }
    @Override
    public String toHtml(List<String> content) {


        return null;
    }
}
