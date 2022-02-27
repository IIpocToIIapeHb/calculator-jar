package by.home.calculator.logic;

import java.util.ArrayList;
import java.util.List;

import by.home.calculator.entity.Lexeme;
import by.home.calculator.entity.LexemeStorage;
import by.home.calculator.entity.LexemeType;

/* 
 * Делит выражение на лексемы и возвращает хранилище с лексемами
 */

public class LexemeParser {

	public LexemeStorage parse(String expression) {

		List<Lexeme> lexemes = new ArrayList<Lexeme>();
		int position = 0;
		while (position < expression.length()) {
			char symbol = expression.charAt(position);
			switch (symbol) {
			case '(':
				lexemes.add(new Lexeme(LexemeType.LEFT_BRACKET, symbol));
				position++;
				break;
			case ')':
				lexemes.add(new Lexeme(LexemeType.RIGHT_BRACKET, symbol));
				position++;
				break;
			case '*':
				lexemes.add(new Lexeme(LexemeType.MULTIPL, symbol));
				position++;
				break;
			case '/':
				lexemes.add(new Lexeme(LexemeType.DIV, symbol));
				position++;
				break;
			case '+':
				lexemes.add(new Lexeme(LexemeType.PLUS, symbol));
				position++;
				break;
			case '-':
				lexemes.add(new Lexeme(LexemeType.MINUS, symbol));
				position++;
				break;
			default:
				if (symbol >= '0' && symbol <= '9') {
					StringBuilder number = new StringBuilder();
					while (symbol >= '0' && symbol <= '9') {
						number = number.append(symbol);
						position++;
						if (position >= expression.length()) {
							break;
						}
						symbol = expression.charAt(position);
					}
					lexemes.add(new Lexeme(LexemeType.NUMBER, number.toString()));
				} else if (symbol != ' ') {
					throw new IllegalArgumentException("Unexpected expression" + symbol);
				} else {
					position++;
				}
			}
		}
		lexemes.add(new Lexeme(LexemeType.END, ""));

		LexemeStorage lexemeStorage = new LexemeStorage(lexemes);
		return lexemeStorage;

	}
}
