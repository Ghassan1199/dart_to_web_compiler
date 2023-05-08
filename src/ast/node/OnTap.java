package ast.node;



public class OnTap extends Node {


    Object child;
    public OnTap(int lineNumber) {
        nodeName = "onChanged";
        this.lineNumber = lineNumber;
    }

    public void setChild(Object child) {
        this.child = child;
    }

    public Object getChild() {
        return child;
    }

    @Override
    public String toString() {
        return nodeName + " at line " + lineNumber + " and its child is " + child;
    }
}