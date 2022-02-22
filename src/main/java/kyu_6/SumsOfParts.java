package kyu_6;

//https://www.codewars.com/kata/5ce399e0047a45001c853c2b/train/java

public class SumsOfParts {
    public static int[] sumParts(int[] ls) {
        int[] result = new int[ls.length + 1];
        int sum = 0;

        for (int i = ls.length-1; i >= 0; i--) {
            sum += ls[i];
            result[i] = sum;
        }
        return result;
    }
}
