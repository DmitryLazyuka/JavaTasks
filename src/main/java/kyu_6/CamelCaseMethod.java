package kyu_6;

//https://www.codewars.com/kata/587731fda577b3d1b0001196/train/java
public class CamelCaseMethod {
    public static String camelCase(String str) {
        if(!str.isEmpty()) {
            StringBuilder builder = new StringBuilder();
            String[] array = str.trim().replaceAll("\\s+", " ").split(" ");

            for (String word : array) {
                word = word.replaceFirst(word.substring(0, 1),word.substring(0, 1).toUpperCase());
                builder.append(word);
            }
            return builder.toString();
        }
        return "";
    }
}