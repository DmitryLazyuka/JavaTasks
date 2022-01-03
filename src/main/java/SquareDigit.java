public class SquareDigit {
    public int squareDigits(int n) {
        int numberOfDigits = String.valueOf(n).length();
        StringBuilder builder = new StringBuilder();

        for (int i = numberOfDigits - 1; i >= 0; i--) {
            int number = (int) (n / (Math.pow(10, i)));
            builder.append(number * number);
            n -= number * (Math.pow(10, i));
        }
        return Integer.parseInt(builder.toString());
    }
}