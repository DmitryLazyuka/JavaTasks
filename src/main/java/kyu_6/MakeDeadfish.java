package kyu_6;

//https://www.codewars.com/kata/51e0007c1f9378fa810002a9/train/java
public class MakeDeadfish {
    public static int[] parse(String data) {
        String[] array = data.split("o");
        int[] result = new int[array.length];
        int index = 0;
        int value = 0;

        for (String s : array) {
            for (char c : s.toCharArray()) {
                switch (c) {
                    case ('i'): {
                        value++;
                        break;
                    }
                    case ('d'): {
                        value--;
                        break;
                    }
                    case ('s'): {
                        value *= value;
                        break;
                    }
                }
            }
            result[index] = value;
            index++;
        }
        return result;
    }
}