package kyu_6;

public class TakeATenMinuteWalk {
    public static boolean isValid(char[] walk) {
        int countN=0;
        int countW=0;
        int countE=0;
        int countS=0;

        if (walk.length != 10) {
            return false;
        }
        for (Character direction : walk) {
            switch (direction) {
                case 'n':
                    countN++;
                    break;
                case 'w':
                    countW++;
                    break;
                case 's':
                    countS++;
                    break;
                case 'e':
                    countE++;
                    break;
            }
        }
        return countE == countW && countN == countS;
    }
}