package ast.node;

import java.util.ArrayList;
import java.util.List;

public class Navigator extends Node {


    private final List<String> data;
    private String goTO;


    public Navigator(int lineNumber) {
        nodeName = "Navigator";
        this.lineNumber = lineNumber;
        data = new ArrayList<>();
    }

    public void addData(String o) {
        this.data.add(o);
    }

    public List<String> getData() {

        return data;
    }

    public void setGoTO(String to) {

        this.goTO = to;
    }

    public String getGoTO() {
        return goTO;
    }

    @Override
    public String toString() {
        return nodeName + " at line " + lineNumber + " and the destination " + getGoTO() + ", with data  " + getData();
    }
}
