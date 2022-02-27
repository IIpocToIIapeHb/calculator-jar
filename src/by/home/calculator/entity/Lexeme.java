package by.home.calculator.entity;

/* Класс, представляющий собой единицу выражения - лексему.
 *  У лексемы есть тип - PLUS. MINUS и т.д. и значение, отражающиеся в выражение - '-', '+' и тд.
 */

public class Lexeme {

	private LexemeType type;
	private String value;

	public Lexeme(LexemeType type, String value) {
		this.type = type;
		this.value = value;
	}

	public Lexeme(LexemeType type, char value) {
		this.type = type;
		this.value = String.valueOf(value);
	}

	
	public LexemeType getType() {
		return type;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Lexeme [type=" + type + ", value=" + value + "]";
	}
}
