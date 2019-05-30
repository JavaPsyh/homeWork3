package psyh;

public class IsStringPalindrome {
    public static boolean isStringPalindrome(String text) {
        if (text == null) return false;
        String textForAnalysis = text.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder reversOfTextForAnalysis = new StringBuilder();
        for (int i = textForAnalysis.length() - 1; i >= 0; i--) {
            reversOfTextForAnalysis.append(textForAnalysis.charAt(i));
        }
        return textForAnalysis.equals(reversOfTextForAnalysis.toString());
    }
}
