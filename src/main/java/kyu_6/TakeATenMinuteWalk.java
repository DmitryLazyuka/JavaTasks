package kyu_6;

public class TakeATenMinuteWalk {
    public static boolean isValid(char[] walk) {
        int x = 0;
        int y = 0;

        if (walk.length != 10) {
            return false;
        }
        for (char direction : walk) {
            switch (direction) {
                case 's':
                    x++;
                    break;
                case 'n':
                    x--;
                    break;
                case 'w':
                    y++;
                    break;
                case 'e':
                    y--;
                    break;
            }
        }
        return x == 0 && y == 0;
    }
}