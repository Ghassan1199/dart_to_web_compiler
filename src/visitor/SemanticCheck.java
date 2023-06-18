package visitor;

import java.util.Objects;

import static visitor.BaseVisitor.errors;

public class SemanticCheck {

    VariableTable variableTable;



   public SemanticCheck(VariableTable variableTable){
        this.variableTable = variableTable;

    }


    void check(){

        checkTypeAndValue();
        checkDuplication();
        checkDeclaration();


    }

    private void checkDeclaration() {

        for (int i = 0; i < variableTable.getData().size(); i++) {

            String string1 = variableTable.getData().get(i).split(",")[0];


            if ((!Objects.equals(string1, "int")) && (!Objects.equals(string1, "float"))
                    && (!Objects.equals(string1, "string")) && (!Objects.equals(string1, "double"))) {

                if (lookFor(string1)) {
                    errors.setError("variable " + string1 + " is not declared ");
                }
            }}
    }
    private boolean lookFor(String var)
    {
        for (int i = 0; i < variableTable.getData().size(); i++) {

            String string1 = variableTable.getData().get(i).split(",")[1];

            if (Objects.equals(var, string1)) {
                return false;
            }
        }

        return true;
    }

    private void checkDuplication() {

        for (int i = 0; i < variableTable.getData().size() - 1; i++) {

            String string1 = variableTable.getData().get(i).split(",")[1];
            String string2 = variableTable.getData().get(i + 1).split(",")[1];

            if (Objects.equals(string1, string2)) {
                errors.setError("variable " + string1 + " is already declared ");
            }
        }
    }


    void checkTypeAndValue()
    {

        for (int i = 0; i < variableTable.getData().size(); i++) {

            String[] strings = variableTable.getData().get(i).split(",");

            if (!Objects.equals(strings[2], "null")) {
                switch (strings[0]) {
                    case "int" -> {
                        boolean n = strings[2].matches("\\d+");
                        if (!n) {
                            errors.setError("variable " + strings[1] + " of type " + strings[0] + " does not match value of " + strings[2]);
                        }
                    }
                    case "float", "double" -> {
                        boolean f = strings[2].matches("^([+-]?\\d*\\.?\\d*)$");
                        if (!f) {
                            errors.setError("variable " + strings[1] + " of type " + strings[0] + " does not match value of " + strings[2]);
                        }
                    }
                    case "string" -> {
                        boolean s = strings[2].matches("\"[ a-zA-Z0-9]+\"");
                        if (!s) {
                            errors.setError("variable " + strings[1] + " of type " + strings[0] + " does not match value of " + strings[2]);
                        }
                    }
                }
            }













        }

    }
}
