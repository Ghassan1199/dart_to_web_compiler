import antlr.FlutterLexer;
import antlr.FlutterParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import ast.program.Program;
import org.antlr.v4.runtime.tree.ParseTree;
import visitor.BaseVisitor;

import java.io.IOException;


import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) throws IOException {
        String source = "Files/input4";
        CharStream cs = fromFileName(source);
        FlutterLexer lexer = new FlutterLexer(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        FlutterParser parser = new FlutterParser(token);
        ParseTree tree = parser.program();
        BaseVisitor firstScan = new BaseVisitor();
        Program program = (Program) firstScan.visit(tree);

        if(!BaseVisitor.errors.getErrors().isEmpty()){
            BaseVisitor.errors.print();
        }
        else {
            System.out.println("-------Symbol Table-------");
            System.out.println();
            firstScan.symbolTable.print();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println(program);
        }


    }
}