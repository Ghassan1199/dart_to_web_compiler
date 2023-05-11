package ast.node;


import java.util.List;

import static java.lang.Math.ceil;
import static java.lang.Math.floor;
import static visitor.BaseVisitor.nodes;

public class Container extends Node {

    private final String child;

    private final String width;
    private final String height;

    private final String margin;

    private final String color;

    public Container(int lineNumber, String child, String width, String height, String margin, String color) {
        nodeName = "Container";
        this.lineNumber = lineNumber;
        this.width = width;
        this.height = height;
        this.margin = margin;
        this.color = color;
        this.child =  child;
    }


    @Override
    public String toString() {
        return nodeName + " at line " + lineNumber +
                ", and its height and width are ( " + height + ", " + width + " ), the margin is " +
                margin + " and the color is " + color + " and its child is " + child;
    }

    @Override
    public String toHtml(String content) {
        StringBuilder sb = new StringBuilder();
        Button button = null;

        sb.append("<div style=");
        if (this.height != null || this.width != null) {
            double value;
            if (this.width != null) {
                 value = java.lang.Double.parseDouble(width) + 10;
                sb.append("\"height: ").append(value).append("px; ");

            }
            else {
                value = java.lang.Double.parseDouble(height) / 16;
                sb.append("\"height: ").append(value).append("rem;\" ");

            }
        }
        if (this.margin != null) {
            int value = (int) ceil((Double.parseDouble(margin) / (371.43)) * 100);
            sb.append("\"margin: 0% ").append(value).append("%;\" ");
        }
        if (this.color != null) {
            String value = color.contains("blue")? "cornflowerblue" : "red";
            sb.append("background-color: ").append(value).append("; ");
        }

        if (child != null) {
            if (child.contains("Button")) {
                for (Node node : nodes) {
                    if (node instanceof Button) {

                        button = (Button) node;
                        break;

                    }
                }
                sb.append("text-align: center\" id=\"btn\">\n");
                if (button != null) {
                    sb.append(button.toHtml(""));
                }


            } else if (this.child.contains("Text")) {
                String value = child.substring(34,child.length() - 1);
                sb.append(">\n<p>");
                sb.append(value);
                sb.append("</p>\n");

            }

        }
        if (this.child != null) {
            sb.append("\n</div>\n");
        }
        else{
            sb.append(">\n</div>\n");

        }

//        if (button != null) {
//            Navigator navigator = null;
//            for (Node node : nodes) {
//                if (node instanceof Navigator) {
//
//                    navigator = (Navigator) node;
//                    break;
//
//                }
//            }
//            if (navigator != null) {
//
//                sb.append(navigator.toHtml(""));
//
//            }
//        }

        return sb.toString();
    }

    @Override
    public String toHtml(List<String> content) {


        return null;
    }
}
