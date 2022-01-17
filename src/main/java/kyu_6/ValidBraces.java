package kyu_6;

public class ValidBraces {
    private static final String PARENTHESIS = "()";
    private static final String SQUARE_BRACKET = "[]";
    private static final String CURLY_BRACE = "{}";
    private static final String EMPTY_STRING = "";

    public boolean isValid(String braces) {
        int lengthBeforeIteration;

        do {
            lengthBeforeIteration = braces.length();
            braces = braces.replace(PARENTHESIS, EMPTY_STRING)
                    .replace(SQUARE_BRACKET, EMPTY_STRING)
                    .replace(CURLY_BRACE, EMPTY_STRING);
        } while (lengthBeforeIteration != braces.length());
        return braces.length() == 0;
    }
}