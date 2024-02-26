class TerminalExpression implements Expression {

    private String variable;

    public TerminalExpression(String variable) {
        this.variable = variable;
    }

    public void interpret(Context context) {

        if (context.getInput().contains(variable)) {
            context.setOutput(context.getOutput() + 1);
        }
    }
}