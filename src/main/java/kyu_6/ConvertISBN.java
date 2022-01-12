package kyu_6;

public class ConvertISBN {
    public static String convert(String s) {
        String stringResult = "978" + s.substring(0, s.length() - 1).replace("-", "");

        int[] intArray = convertStringToIntArray(stringResult);
        int lastDigit = countLastDigit(intArray);
        stringResult = stringResult + lastDigit;

        return stringResult.replaceFirst("(\\d{3})(\\d)(\\d{5})(\\d{3})(\\d)", "$1-$2-$3-$4-$5");
    }

    private static int[] convertStringToIntArray(String s) {
        int[] intArray = new int[s.length()];

        for (int i=0; i<s.length();i++){
            intArray[i] =  Character.getNumericValue(s.charAt(i));
        }
        return intArray;
    }

    private static int countLastDigit(int[] array){
        int number = 0;
        for (int i = 0; i < array.length - 1; i += 2) {
            number += array[i] + array[i + 1] * 3;
        }
        return 10 - number % 10;
    }
}