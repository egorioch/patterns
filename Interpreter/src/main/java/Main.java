import expr.Expression;
import expr.Correction;
import expr.Punctuation;
import expr.Typo;

public class Main {
    public static void main(String[] args) {
        String text = """
                This sentense is ful of typoz and      incorrect,      punctuation!Flower - not berrie!


                Это его “но! “ было вообще ни к чёрту.""";

        Expression correction = new Correction(
                new Typo("sentense", "sentence"),
                new Typo("typoz", "types"),
                new Typo("ful", "full"),
                new Punctuation(",\\s*", ", "),
                new Punctuation("!\\s*", "! "),
                new Punctuation("\\.", ". "),
                new Punctuation("\\s+", " "),
                new Punctuation(" - ", " — ")
        );

        text = correction.interpreter(text);
        System.out.println("text: " + text);
    }
}
