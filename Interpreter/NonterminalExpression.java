class NonterminalExpression implements Expression {

    private Expression expression1;
    private Expression expression2;

    public NonterminalExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }
    
    public void interpret(Context context) {
        expression1.interpret(context);
        expression2.interpret(context);
    }
}