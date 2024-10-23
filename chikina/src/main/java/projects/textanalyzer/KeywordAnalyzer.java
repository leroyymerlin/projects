package projects.textanalyzer;

public abstract class KeywordAnalyzer implements TextAnalyzer {

    public abstract String[] getKeyWords();

    public abstract Label getLabel();

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        return Label.OK;
    }

    @Override
    public Label processText(String text) {
        for (String keyword : getKeyWords()) {
            if (text.contains(keyword))
                return getLabel();
        }
        return Label.OK;
    }
}
