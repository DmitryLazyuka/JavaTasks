package kyu_6;

public class ValidBraces {
    static final String PARENTHESIS = "()";
    static final String SQUARE_BRACKET = "[]";
    static final String CURLY_BRACE = "{}";

    public boolean isValid(String braces) {
        while (braces.contains(PARENTHESIS) || braces.contains(SQUARE_BRACKET) || braces.contains(CURLY_BRACE)) {
            braces = braces.replace(PARENTHESIS, "")
                    .replace(SQUARE_BRACKET, "")
                    .replace(CURLY_BRACE, "");
        }
        return braces.length() == 0;
    }
}