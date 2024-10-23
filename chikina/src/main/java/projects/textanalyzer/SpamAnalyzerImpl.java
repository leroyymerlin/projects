package projects.textanalyzer;

public class SpamAnalyzerImpl extends KeywordAnalyzer {

    private final String[] keyWords;

    public SpamAnalyzerImpl (String[] keyWords) {
        this.keyWords = keyWords;
    }

    @Override
    public String[] getKeyWords() {
        return keyWords;
    }

    @Override
    public Label getLabel() {
        return Label.SPAM;
    }
}
