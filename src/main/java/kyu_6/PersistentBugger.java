package kyu_6;

public class PersistentBugger {
    public static int persistence(long n) {
        int numberOfIterations = 0;
        while (n / 10 != 0) {
            int temp = 1;
            while (n != 0) {
                int number = (int) n % 10;
                n /= 10;
                temp *= number;
            }
            n = temp;
            numberOfIterations++;
        }
        return numberOfIterations;
    }
}