package ast.node;

import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Function extends Node {

    private final String funType;
static int n = 0;
    private final String funName;
    private final List<Pair<String, String>> parameters;
    private final List<Object> children;

    public Function(int lineNumber, String funType, String funName) {
        nodeName = "Function";
        this.lineNumber = lineNumber;
        this.funType = funType;
        this.funName = funName;
        parameters = new ArrayList<>();
        children = new ArrayList<>();

    }

    public void addChild(Object child) {
        children.add(child);
    }

    public void addParameter(String type, String name) {
        parameters.add(new Pair<>(type, name));

    }

    StringBuilder childrenToString(List<Object> children) {
        StringBuilder rc = new StringBuilder();
        for (Object child : children) {

            if (child != null) {
                rc.append(child).append("\n\n");

            }        }
        return rc;
    }

    @Override
    public String toString() {
        return  " *** " + nodeName + " at line " + lineNumber + ", its type is " + funType
                + ", its name is " + funName   + "\n\n parameter is "
                + parameters.get(0).b + " with data type of " + parameters.get(0).a + ", and its children are : \n\n " + childrenToString(children)
                + " *** \n";

    }
    @Override
    public String toHtml(List<String> content) {


        return null;
    }
    @Override
    public String toHtml(String content) {



    StringBuilder sb = new StringBuilder();


        if ((!Objects.equals(funName, "build")) && (n == 0)) {
            n++;
            sb.append("<div style=\"position: fixed; top: 50%; left: 50%; transform: translate(-50%, -50%); font-size: 36px; font-weight: bold; text-align: center;\">\n" +
                    "You have pushed the button this many times: <span style=\"display: inline-block; margin-left: 5px;\">0</span>");
        }

        return sb.toString();
    }
}
