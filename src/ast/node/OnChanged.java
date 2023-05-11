package ast.node;

import java.util.ArrayList;
import java.util.List;

public class OnChanged extends Node {


    Object child;
    Object parameter;
    public OnChanged(int lineNumber) {
        nodeName = "OnTap";
        this.lineNumber = lineNumber;
    }

    public void setChild(Object child) {
        this.child = child;
    }

    public void setParameter(Object parameter) {
        this.parameter = parameter;
    }

    public Object getParameter() {
        return parameter;
    }

    public Object getChild() {
        return child;
    }

    @Override
    public String toString() {
        return nodeName + " at liner " + lineNumber + ", and its parameter is "+getParameter()+ " and its child is " + child;
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