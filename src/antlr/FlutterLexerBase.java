package antlr;

import java.util.List;
import org.antlr.v4.runtime.*;

public abstract class FlutterLexerBase extends Lexer
{
    protected FlutterLexerBase(CharStream input) {
        super(input);
    }

    protected boolean CheckNotOpenBrace()
    {
        return _input.LA(1) != '{';
    }
}