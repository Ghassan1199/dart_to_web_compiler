package ast.node;

import java.util.List;

public class string extends Node {


    private final String value;

    string(int lineNumber, String value) {
        nodeName = "String";
        this.lineNumber = lineNumber;
        this.value = value;
    }
    @Override
    public String toHtml(List<String> content) {


        return null;
    }
    @Override
    public String toString() {
        return value;
    }

    @Override
    public String toHtml(String content) {
        return null;
    }
}
