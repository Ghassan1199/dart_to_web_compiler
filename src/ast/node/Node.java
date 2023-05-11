package ast.node;


import java.util.List;

public abstract class Node {
    protected String nodeName;
    protected int lineNumber;
    protected String toHtml(){
        return null;
    };

    public abstract String toHtml(String content);


    public abstract String toHtml(List<String> content);
}
