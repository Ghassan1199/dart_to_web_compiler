package ast.node;

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
}
