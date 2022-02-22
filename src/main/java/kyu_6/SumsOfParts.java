package kyu_6;

//https://www.codewars.com/kata/5ce399e0047a45001c853c2b/train/java
import java.util.stream.IntStream;

public class SumsOfParts {
    public static int[] sumParts(int[] ls) {
        int sum = IntStream.of(ls).sum();
        int[]result = new int[ls.length+1];
        result[0] = sum;

        for (int i = 0; i< ls.length; i++){
            sum -= ls[i];
            result[i+1] = sum;
        }
        return result;
    }
}
