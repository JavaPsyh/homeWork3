package tasks.filterofcomments;

abstract class KeywordAnalizer implements TextAnalyzer{

    abstract String[] getKeywords();

    abstract Label getLabel();

    @Override
    public Label processText(String text) {
        String[] arrayOfKeywords = getKeywords();
        for (String keyword : arrayOfKeywords) {
            if (text.contains(keyword)) {
                return getLabel();
            }
        }
        return Label.OK;
    }
}
