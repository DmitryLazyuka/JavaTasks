package kyu_6;

public class ValidateCreditCard {
    public static boolean validate(String n) {
        long cardNumber = Long.parseLong(n);
        long value = 0;

        for (int i = 0; i < n.length(); i++) {
            long digit = cardNumber % 10;
            if (i % 2 != 0) {
                digit = (digit * 2) > 9 ? (digit * 2) - 9 : digit * 2;
            }
            value += digit;
            cardNumber /= 10;
        }
        return value % 10 == 0;
    }
}