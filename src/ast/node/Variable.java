package ast.node;

import java.util.List;

public class Variable extends Node {

    private final String varType;
    private final String varName;

    private final String value;


    public Variable(int lineNumber, String varType, String varName, String value) {
        nodeName = "Variable";
        this.lineNumber = lineNumber;
        this.varType = varType;
        this.varName = varName;
        this.value = value;

    }

    @Override
    public String toString() {

        return nodeName + " at line " + lineNumber + " and its type is " + varType + " and its name is "
                + varName + " and its value is " + value;
    }
    @Override
    public String toHtml(List<String> content) {


        return null;
    }
    @Override
    public String toHtml(String content) {
        return null;
    }
}
