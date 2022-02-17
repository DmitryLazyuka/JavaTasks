package kyu_7;
//https://www.codewars.com/kata/58f0ba42e89aa6158400000e/train/java

public class Folding {
    public static Long fold(Double distance) {

        if (distance >= 0) {

            long fold = 0;
            double thickness = 0.0001;

            while (thickness < distance) {
                thickness *= 2;
                fold += 1;
            }
            return fold;
        }
        return null;
    }
}