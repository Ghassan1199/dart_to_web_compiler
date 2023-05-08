package ast.node;

import java.util.ArrayList;
import java.util.List;

public class InputDecoration extends Node{


    String border;
    String hintText;
    public InputDecoration(int lineNumber, String border, String hintText) {
        nodeName = "InputDecoration";
        this.lineNumber = lineNumber;
        this.border =border;
        this.hintText = hintText;


    }

    @Override
    public String toString() {
        return nodeName + " at line" + lineNumber + ", border is "+ border + " and its hint Text is " + hintText;

    }
}
