public class Main {

    public static void main(String[] args) {

        Expression expression = new NonterminalExpression(
            new TerminalExpression("A"),
            new TerminalExpression("B")
        );

        Context context = new Context("A B A");
        expression.interpret(context);
        System.out.println(context.getOutput());
    }
}