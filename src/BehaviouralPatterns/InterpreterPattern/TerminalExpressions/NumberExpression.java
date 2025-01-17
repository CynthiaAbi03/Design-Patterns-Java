package BehaviouralPatterns.InterpreterPattern.TerminalExpressions;

import BehaviouralPatterns.InterpreterPattern.Expression;

public class NumberExpression implements Expression {
    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return number;
    }
}
