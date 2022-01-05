package kyu_7;

public class SquareDigit {
    public int squareDigits(int n) {
        StringBuilder builder = new StringBuilder();
        if(n==0){
            return 0;
        }
        while (n>0) {
            int number = n%10;
            builder.insert(0,number * number);
            n /= 10;
        }
        return Integer.parseInt(builder.toString());
    }
}