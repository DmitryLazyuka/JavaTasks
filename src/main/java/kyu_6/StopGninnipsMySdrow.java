package kyu_6;

import java.util.Arrays;
import java.util.List;

public class StopGninnipsMySdrow {

    public final String SPACE = " ";

    public String spinWords(String sentence) {
        StringBuilder result = new StringBuilder();
        String[] array = sentence.split(SPACE);

        for (String word : array) {
            if (word.length() >= 5) {
                result.append(new StringBuilder(word).reverse()).append(SPACE);
            } else {
                result.append(word).append(SPACE);
            }
        }
        return result.toString().trim();
    }

    public String spinWords2(String sentence) {

        List<String> list = Arrays.asList(sentence.split(SPACE));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() >= 5) {
                list.set(i, new StringBuilder(list.get(i)).reverse().toString());
            }
        }
        return String.join(SPACE, list);
    }
}