package ast.node;

public class VariableDeclaration extends Node {


    private final String varType;
    private final String varName;


    public VariableDeclaration(int lineNumber, String varType, String varName) {
        nodeName = "VariableDeclaration";
        this.lineNumber = lineNumber;
        this.varType = varType;
        this.varName = varName;
    }

    @Override
    public String toString() {

        return nodeName + " at line " + lineNumber + " and its type is " + varType + " and its name is "
                + varName;
    }
}
