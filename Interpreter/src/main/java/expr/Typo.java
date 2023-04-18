package expr;

public class Typo implements Expression {
    private String typo;
    private String correction;

    public Typo(String typo, String correction) {
        this.typo = typo;
        this.correction = correction;
    }

    @Override
    public String interpreter(String context) {
        return context.replaceAll(typo, correction);
    }
}
