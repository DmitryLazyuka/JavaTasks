package kyu_6;

public class BreakCamelCase {
    public static String camelCase(String input) {

        char[] array = input.toCharArray();
        StringBuilder output = new StringBuilder();

        for (char c : array) {
            if ((Character.isUpperCase(c))) {
                output.append(" ");
            }
            output.append(c);
        }
        return output.toString();
    }
}