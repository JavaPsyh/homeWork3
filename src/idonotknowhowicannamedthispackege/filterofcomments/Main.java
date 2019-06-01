package idonotknowhowicannamedthispackege.filterofcomments;

public class Main {
    public static void main(String[] args) {
        //I have heard you about ukrainian and rusian comments - just English!
        //It had bean copied for testing, that's why I delete it.
    }

    private Label checkLabels(TextAnalyzer[] textAnalyzer, String text) {

        for (TextAnalyzer tAnalyzer : textAnalyzer) {
            Label label = tAnalyzer.processText(text);
            if (label != Label.OK) return label;
        }
        return Label.OK;
    }
}


