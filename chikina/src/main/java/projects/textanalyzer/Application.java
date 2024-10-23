package projects.textanalyzer;

public class Application {
    public static void main(String args[]) {
        System.out.println(checkLabels(analyzers, test));
    }

    public static String[] spamKeyWords = {"spam", "ads"};

    String[] negativeKeyWords = {"bad", "fuck"};

    public static int maxLengthInput;

    public static String test = "Negative";

    public static TextAnalyzer[] analyzers = {new SpamAnalyzerImpl(spamKeyWords), new NegativeTextAnalyzerImpl(),
        new TooLongTextAnalyzerImpl(maxLengthInput) };

    public static Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for(int i=0; i<analyzers.length; i++) {
            if(!analyzers[i].processText(test).equals(Label.OK)) {
                return analyzers[i].processText(test);
            }
            return Label.OK;
        }
        return Label.OK;
    }
}
