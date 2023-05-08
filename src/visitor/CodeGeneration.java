package visitor;

public class CodeGeneration {

    SymbolTable symbolTable;
    VariableTable variableTable;

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    public void setVariableTable(VariableTable variableTable) {
        this.variableTable = variableTable;
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public VariableTable getVariableTable() {
        return variableTable;
    }
}

