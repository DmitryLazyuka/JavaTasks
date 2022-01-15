package kyu_6;

import java.lang.StringBuilder;

public class StringToCamelCase {
    static String toCamelCase(String s) {
        String[] array = s.split("[_|-]");
        StringBuilder builder = new StringBuilder(array[0]);
        for (int i = 1; i < array.length; i++) {
            builder.append(array[i].substring(0, 1).toUpperCase()).append(array[i].substring(1).toLowerCase());
        }
        return builder.toString();
    }
}