package ast.node;


import java.util.List;

public class Container extends Node {

    private final Object child;

    private final String width;
    private final String height;

    private final String margin;

    private final String color;

    public Container(int lineNumber, Object child, String width, String height, String margin, String color) {
        nodeName = "Container";
        this.lineNumber = lineNumber;
        this.width = width;
        this.height = height;
        this.margin = margin;
        this.color = color;
        this.child = child;
    }


    @Override
    public String toString() {
        return nodeName + " at line " + lineNumber +
                ", and its height and width are ( " + height + ", " + width + " ), the margin is " +
                margin + " and the color is " + color + " and its child is " + child;
    }
}
