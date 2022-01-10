package kyu_7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class HighestAndLowest {
    public static String highAndLow(String numbers) {

        List<Integer> listOfNumbers;
        listOfNumbers =  Arrays.stream(numbers.split(" ")).map(Integer::valueOf).collect(Collectors.toList());

        int max = Collections.max(listOfNumbers);
        int min = Collections.min(listOfNumbers);

        return max + " " + min;
    }
}