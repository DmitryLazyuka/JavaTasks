package kyu_6;

//https://www.codewars.com/kata/59df2f8f08c6cec835000012/train/java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Meeting {
    public static String meeting(String s) {
        StringBuilder builder = new StringBuilder();
        List<String> result = new ArrayList<>();

        String[] list = s.split(";");

        for (String pair : list) {
            String[] array = pair.split(":");
            builder.append("(").append(array[1].toUpperCase())
                    .append(", ").append(array[0].toUpperCase()).append(")");
            result.add(builder.toString());
            builder.setLength(0);
        }
        Collections.sort(result);

        return String.join("", result);
    }
}