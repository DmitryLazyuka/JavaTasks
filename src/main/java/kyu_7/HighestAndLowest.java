package kyu_7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class HighestAndLowest {
    public static String highAndLow(String numbers) {

        List<Integer> listOfNumbers = Arrays.stream(numbers.split(" ")).map(Integer::valueOf).collect(Collectors.toList());

        int max = Collections.max(listOfNumbers);
        int min = Collections.min(listOfNumbers);

        return max + " " + min;
    }

    public static String highAndLow2(String numbers){

        String[] arrayOfNumbers = numbers.split(" ");
        int min = Integer.parseInt(arrayOfNumbers[0]);
        int max = min;

        for (String number: arrayOfNumbers) {
            int temp = Integer.parseInt(number);
            min = Math.min(temp, min);
            max = Math.max(temp, max);
        }

        return max + " " + min;
    }
}