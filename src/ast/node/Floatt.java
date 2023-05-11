package ast.node;

import java.util.List;

public class Floatt extends Node {

    private final float value;

    public Floatt(int lineNumber, Node sibling, Node parent, float value) {
        nodeName = "Float";
        this.lineNumber = lineNumber;

        this.value = value;
    }

    @Override
    public String toString() {
        return value + " ";
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
