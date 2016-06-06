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
		/*		
		 Symbols x = parser.parse();
		 Parser p = new Parser()
		//programa na forma de AST
		Program prog = (Program)p.parse().value;
		BuildSymbolTableVisitor stVis = new BuildSymbolTableVisitor();
		//construindo tabela de símbolos
		prog.accept(stVis); 
		//fazendo a checagem de tipos
		prog.accept(new TypeCheckVisitor(stVis.getSymbolTable())); 
		*/
		}

	}


