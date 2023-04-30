package ast.node;



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
}
