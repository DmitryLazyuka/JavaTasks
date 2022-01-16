package kyu_6;

public class FindTheMissingLetter {
    public static char findMissingLetter(char[] array) {
        char result = ' ';
        for (int i = 0; i < array.length-1; i++) {
            if (array[i + 1] - array[i] != 1) {
                int ascii = array[i] + 1;
                result = (char) ascii;
                break;
            }
        }
        return result;
    }
}