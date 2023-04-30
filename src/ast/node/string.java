package ast.node;

public class string extends Node {


    private final String value;

    string(int lineNumber, String value) {
        nodeName = "String";
        this.lineNumber = lineNumber;
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
