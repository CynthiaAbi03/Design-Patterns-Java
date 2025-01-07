package BehaviouralPatterns.InterpreterPattern;

import BehaviouralPatterns.InterpreterPattern.NonTerminalExpressions.AddExpression;
import BehaviouralPatterns.InterpreterPattern.NonTerminalExpressions.SubstractExpression;
import BehaviouralPatterns.InterpreterPattern.TerminalExpressions.NumberExpression;

public class Client {
    public static void main(String[] args) {
        Expression number1 = new NumberExpression(5);
        Expression number2 = new NumberExpression(2);
        Expression number3 = new NumberExpression(3);
        Expression addition = new AddExpression(number1, number2);
        Expression subtraction = new SubstractExpression(addition, number3);
        System.out.println("Result: " + subtraction.interpret());
    }
}
