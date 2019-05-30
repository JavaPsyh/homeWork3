package psyh.filterOfComments;

abstract class KeywordAnalizer implements TextAnalyzer {

    abstract String[] getKeywords();

    abstract Label getLabel();

    @Override
    public Label processText(String text) {
        String[] arrayOfKeywords = getKeywords();
        for (int i = 0; i < arrayOfKeywords.length; i++) {
            if (text.contains(arrayOfKeywords[i])) {
                return getLabel();
            }
        }
        return Label.OK;
    }
}
