package by.home.calculator.controller;

import by.home.calculator.entity.LexemeStorage;
import by.home.calculator.logic.LexemeParser;
import by.home.calculator.logic.LexemeProcessor;

public class Calculator {

	public double calculate(String expression) {

		LexemeParser lexemeParser = new LexemeParser();
		LexemeStorage lexemeStorage = lexemeParser.parse(expression);
		LexemeProcessor lexemeProcessor = new LexemeProcessor();

		double result = lexemeProcessor.calculate(lexemeStorage);

		return result;
	}
}
