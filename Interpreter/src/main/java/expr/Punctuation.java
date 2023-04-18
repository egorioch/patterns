package expr;

public class Punctuation implements Expression {
    private final String punctuation;
    private final String correction;

    public Punctuation(String punctuation, String correction) {
        this.punctuation = punctuation;
        this.correction = correction;
    }

    @Override
    public String interpreter(String context) {
        return context.replaceAll(punctuation, correction);
    }
}
