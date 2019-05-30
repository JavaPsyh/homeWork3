package psyh.filterOfComments;

class SpamAnalyzer extends KeywordAnalizer {
    private String[] keywords;

    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }

    @Override
    String[] getKeywords() {
        return keywords;
    }

    @Override
    Label getLabel() {
        return Label.SPAM;
    }

}
