package kyu_7;

public class MiddleExample {
    public static String getMiddle(String word) {
        int length = word.length();
        if (length % 2 == 0) {
            return word.substring(length / 2 - 1, length / 2 + 1);
        } else {
            return String.valueOf(word.charAt(length / 2));
        }
    }
}