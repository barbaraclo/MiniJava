package analisadorSintatico;

import java.io.IOException;

import ast.Program;
import java_cup.internal_error;
import visitor.BuildSymbolTableVisitor;
import visitor.TypeCheckVisitor;

public class GeradorSintatico {

	public static void main(String[] args) throws internal_error, IOException, Exception {
		java_cup.Main.main(new String []{"-parser", "AnalisadorSintatico", "-interface", "-symbols", "Symbols",
				"-destdir", "src/analisadorSintatico", "-expect", "1000", "src/analisadorSintatico/EspecificacaoSintatica.cup"});
				
		/*ParserCup parser = new ParserCup();
		Symbols x = parser.parse();
		//programa na forma de AST
		Program prog = (Program) parser.parse().value;
		BuildSymbolTableVisitor stVis = new BuildSymbolTableVisitor();
		prog.accept(stVis); 
		//chama o visitor de pretty print
		prog.accept(new TypeCheckVisitor(stVis.getSymbolTable()));
		int a = 0;
		*/
		}

	}


