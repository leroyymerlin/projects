package projects.textanalyzer;

public class NegativeTextAnalyzerImpl extends KeywordAnalyzer {

    public NegativeTextAnalyzerImpl() {

    }

    private final String[] keyWords = {":(", "=(", ":|"};

    @Override
    public String[] getKeyWords() {
        return keyWords;
    }

    @Override
    public Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }

    @Override
    public Label processText(String text) {
        return processText(text);
    }
}
