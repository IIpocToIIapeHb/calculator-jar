package by.home.calculator.entity;

import java.util.List;

/*
 * Хранилище Лексем. При парсинге выражения все лексемы попадают в хранилище(лист).
 */

public class LexemeStorage {

	private int position;
	private List<Lexeme> lexemes;

	public LexemeStorage(List<Lexeme> lexemes) {

		this.lexemes = lexemes;

	}

	public int getPosition() {
		return position;
	}
	
	public int backPosition() {
		return position--;
	}

	public Lexeme next() {
		return lexemes.get(position++);
	}

	public void deleteLexeme() {
		lexemes.remove(position);
	}

	public void addLexeme(Lexeme lexeme, int position) {
		lexemes.add(position, lexeme);
	}

}
