package visitor;

import ast.node.*;


import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.Integer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CodeGeneration {


    int navId;
    int colId;

    boolean isSecond;
    List<Integer> txtIndexes;

    List<String> txtFldIds;


    List<String> txtIds;
    VariableTable variableTable;

    public static String file = "second_page";



    PrintWriter writer;

    List<Node> nodes;

    CodeGeneration(List<Node> nodes) {
        this.nodes = nodes;
        this.txtFldIds = new ArrayList<>();
        this.txtIds = new ArrayList<>();
        this.txtIndexes = new ArrayList<>();
        this.navId = -1;
        this.colId = -1;
        this.isSecond = Objects.equals(file, "second_page");
    }

    public  void generate() throws FileNotFoundException {


        writer = new PrintWriter("C:/Users/faleh/Desktop/New folder (4)/" + file + ".html");
        try {

            String html = "";
            String body = "";
            StringBuilder content = new StringBuilder();



            int size = nodes.size();

            for (int i = 0; i < size - 2; i++) {


                    if ((nodes.get(i) instanceof Navigator)) {
                        this.navId = i;

                    } else if ((nodes.get(i) instanceof Column)) {
                        this.colId = i;

                    } else if ((nodes.get(i) instanceof Button)) {
                        continue;

                    }

                    if (isSecond) {
                        if (nodes.get(i).toHtml("") != null) {
                            content.append(nodes.get(i).toHtml("")).append("\n");

                        }


                        if (nodes.get(i) instanceof Text text) {
                            this.txtIds.add(text.getChild().toString());
                        }

                    } else if (!(nodes.get(i) instanceof Text)) {

                        if (nodes.get(i).toHtml("") != null) {
                            content.append(nodes.get(i).toHtml("")).append("\n");

                        }


                    }


                    if (nodes.get(i) instanceof TextField) {
                        nodes.get(i).toHtml("");
                        this.txtFldIds.add(((TextField) nodes.get(i)).getId());
                    }
                }





            if (nodes.get(size - 2) instanceof Scaffold) {

                if (navId != -1) {
                    body = nodes.get(size - 2).toHtml(content + "\n" + nodes.get(this.navId).toHtml(txtFldIds));

                }
                else if (colId != -1)
                {
                    body = nodes.get(size - 2).toHtml(content + "\n" + nodes.get(this.colId).toHtml(txtIds));

                }
                else {
                    body = nodes.get(size - 2).toHtml(content.toString());



                }

            }
            if (nodes.get(size - 1) instanceof ast.node.Class) {

                html = nodes.get(size - 1).toHtml(body);
            }


            writer.println(html);


            gc();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            writer.close();
            writer.flush();

        }

    }

    public void setVariableTable(VariableTable variableTable) {
        this.variableTable = variableTable;
    }


    public VariableTable getVariableTable() {
        return variableTable;
    }



    public void gc() throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter("C:/Users/faleh/Desktop/New folder (4)/" + "style" + ".css");
        StringBuilder sb = new StringBuilder();

        sb.append("button {\n" +
                "    display: block;\n" +
                "    width: 100%;\n" +
                "    height: 100%;\n" +
                "    border: none;\n" +
                "    background-color: transparent;\n" +
                "}\n" +
                "\n" +
                "input {\n" +
                "    display: block;\n" +
                "    border: none;\n" +
                "    width: 100%;\n" +
                "    border-radius: 5px;\n" +
                "    padding: 10px;\n" +
                "    background-color: #f2f2f2;\n" +
                "    font-size: 16px;\n" +
                "    color: #333;\n" +
                "    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);\n" +
                "}\n" +
                "\n" +
                "body{\n" +
                "    padding: 0% 25% ;\n" +
                "}\n" +
                "\n" +
                "p{\n" +
                "    text-align: center;\n" +
                "}");
        try {
            printWriter.println(sb);

        }catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            printWriter.close();
            printWriter.flush();

        }

    }
}

