package kyu_6;

import java.util.ArrayList;
import java.util.List;

public class MexicanWave {

    public static String[] wave(String str) {

        List<String> result = new ArrayList<>();
        StringBuilder builder = new StringBuilder(str);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                builder.setCharAt(i, Character.toUpperCase(str.charAt(i)));
                result.add(builder.toString());
                builder.setCharAt(i, Character.toLowerCase(str.charAt(i)));
            }
        }
        return result.toArray(String[]::new);
    }
}