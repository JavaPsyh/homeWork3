package tasks;

public class IsStringPalindrome {
    public static boolean isStringPalindrome(String text) {
        if (text == null) {
            return false;
        }
        String textForAnalysis = text.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String reversOfTextForAnalysis = new StringBuilder(textForAnalysis).reverse().toString();
        return textForAnalysis.equals(reversOfTextForAnalysis);
    }
}

