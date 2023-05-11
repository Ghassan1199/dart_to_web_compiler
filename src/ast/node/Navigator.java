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


    @Override
    public String toHtml(String content) {
        return null;
    }

    @Override
    public String toHtml(List<String> ids) {



        StringBuilder sb = new StringBuilder();
        sb.append("<script>\n");
        sb.append("function nav(){\n");

        for (String id : ids) {
            sb.append("const ").append(id).append(" = document.getElementById(\'").append(id).append("_input\').value;\n");
        }

      sb.append("\n window.location.href = \"/").append(this.goTO).append(".html");

        sb.append("?"+ids.get(0).trim()+"=\"+"+ids.get(0).trim());

        String str;
        for (int i = 1; i < ids.size() ; i++) {


            sb.append("+\"&"+ ids.get(i).trim()+"=\"+"+ids.get(i).trim());
        }
        sb.append(";");
        sb.append("\n}");
        sb.append("\n</script>");

        return sb.toString();
    }

}
