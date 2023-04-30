package ast.program;

import ast.node.Node;

import java.util.ArrayList;
import java.util.List;


public class Program {

    private final List<Node> children;

    public Program() {
        this.children = new ArrayList<>();
    }

    public void addChild(Node child) {
        this.children.add(child);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Node child : this.children) {
            stringBuilder.append(child);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
