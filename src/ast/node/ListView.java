package ast.node;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static visitor.CodeGeneration.file;

public class ListView extends Node {
    private final List<Object> children;

   private final String padding;
    public ListView(int lineNumber, String padding) {
        nodeName = "ListView";
        this.lineNumber = lineNumber;
        this.padding = padding;
        this.children = new ArrayList<>();

    }

    public List<Object> getChildren() {
        return children;
    }

    public void addChild(Object child) {
        children.add(child);
    }
    @Override
    public String toHtml(List<String> content) {


        return null;
    }
    StringBuilder childrenToString(List<Object> children) {
        StringBuilder rc = new StringBuilder();
        for (Object child : children) {

            if (child != null) {
                rc.append(child).append("\n");

            }        }
        return rc;
    }


    @Override
    public String toString() {
        return nodeName + " at line" + lineNumber + ", padding is "+ padding + " and its children are \n" + childrenToString(children);

    }

    @Override
    public String toHtml(String content) {

        if ((Objects.equals(file, "third_page")))
        {
            StringBuilder sb = new StringBuilder();
            sb.append("<script>\n");
         sb.append("   var counter = 0;\n" +
        "    var button = document.querySelector('div:last-of-type');\n" +
        "    var counterDisplay = document.querySelector('div:first-of-type span');\n" +
        "    \n" +
        "    button.addEventListener('click', function() {\n" +
        "      counterDisplay.textContent = ++counter;\n" +
        "    });");
            sb.append("\n</script>");
            return sb.toString();
        }

        return "";



    }
}
