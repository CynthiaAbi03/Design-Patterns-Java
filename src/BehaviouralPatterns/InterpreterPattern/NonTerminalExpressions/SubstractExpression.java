package BehaviouralPatterns.InterpreterPattern.NonTerminalExpressions;

import BehaviouralPatterns.InterpreterPattern.Expression;

public class SubstractExpression implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;

    public SubstractExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret() {
        return leftExpression.interpret() - rightExpression.interpret();
    }
}
