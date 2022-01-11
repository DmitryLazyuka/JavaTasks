package kyu_6;

public class StopGninnipsMySdrow {

    public String spinWords(String sentence) {

        StringBuilder result = new StringBuilder();
        String[] array = sentence.split(" ");

        for (String word : array) {
            if (word.length() >= 5) {
                result.append(new StringBuilder(word).reverse()).append(" ");
            } else {
                result.append(word).append(" ");
            }
        }
        return result.toString().trim();
    }
}