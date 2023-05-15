package ast.node;

import java.util.ArrayList;
import java.util.List;

public class SetState extends Node{



    private final List<Object> children;


    public SetState(int lineNumber) {
        nodeName = "SetState";
        this.lineNumber = lineNumber;
        this.children = new ArrayList<>();

    }


    public void addChild(Object child) {
        children.add(child);
    }

    StringBuilder childrenToString(List<Object> children) {
        StringBuilder rc = new StringBuilder();
        for (Object child : children) {

            if (child != null) {
                rc.append(child).append("\n");

            }
        }
        return rc;
    }

    @Override
    public String toString() {
        return nodeName + " at line " + lineNumber + " and its children are \n" + childrenToString(children);
    }



    @Override
    public String toHtml(String content) {
return null;
    }

    @Override
    public String toHtml(List<String> ids) {

  /*
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
   */
   return null;
    }

}
