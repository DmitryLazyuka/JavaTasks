package kyu_7;

//https://www.codewars.com/kata/5f77d62851f6bc0033616bd8/train/java
public class ValidSpacing {
    public static boolean validSpacing(String s) {
        if (!s.startsWith(" ") && !s.endsWith(" ")) {
            return !s.contains("  ");
        } else {
            return false;
        }
    }
}