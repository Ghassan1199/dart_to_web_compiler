package visitor;

import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayList;
import java.util.List;

public class Error {



    private final List<String> errors = new ArrayList<>();

    public void setError(String value) {
        this.errors.add(value);
    }

    public List<String> getErrors() {
        return errors;
    }

    public void print() {

        for (String error : errors) {

            System.out.println(error);

        }



    }


    public StringBuilder er() {

        StringBuilder sb = new StringBuilder();
        for (String error : errors) {

            sb.append("\n").append(error);

        }

        return sb;

    }
}
