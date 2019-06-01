package idonotknowhowicannamedthispackege;

public class StringsPerRoles {
    private static String colon = ":";
    private static String closeBrace = ")";
    private static String space = " ";
    private static String newLine = "\n";


    public static String[] roles = {
            "Городничий", "Аммос Федорович",
            "Артемий Филиппович",
            "Лука Лукич"};
    public static String[] text = {
            "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
            "Аммос Федорович: Как ревизор?",
            "Артемий Филиппович: Как ревизор?",
            "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
            "Аммос Федорович: Вот те на! ",
            "Артемий Филиппович: Вот не было заботы, так подай!",
            "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

    public static String stringsPerRoles(String[] roles, String[] text) {
        StringBuilder result = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < roles.length; i++) {
            result.append(roles[i]).append(colon).append(newLine);

            for (int j = 0; j < text.length; j++) {
                temp.setLength(0);
                if (text[j].startsWith(temp.append(roles[i]).append(colon).toString())) {
                    result.append(j + 1).append(closeBrace).append(text[j].replace(temp.toString(), "")).append(newLine);
                }
            }
            result.append(newLine);
        }
        return result.toString();
    }
}
