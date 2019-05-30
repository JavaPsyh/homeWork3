package psyh.filterOfComments;

class NegativeTextAnalyzer extends KeywordAnalizer {
    private String[] keywords = new String[]{":(", "=(", "8(", ":-(", ":|", "8|"};

    @Override
    String[] getKeywords() {
        return keywords;
    }

    @Override
    Label getLabel() {
        return Label.NEGATIV_TEXT;
    }

}
