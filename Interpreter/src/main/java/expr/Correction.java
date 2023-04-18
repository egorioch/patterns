package expr;

public class Correction implements Expression{
    private Expression expression[];

    public Correction(Expression... expression) {
        this.expression = expression;
    }

    @Override
    public String interpreter(String context) {
        for (Expression e : expression) {
            context = e.interpreter(context);
        }

        return context;
    }
}
