public class Accumul {

    public static String accum(String s) {

        StringBuilder builder = new StringBuilder();
        String[] characters = s.split("(?!^)");

        for (int i = 0; i < characters.length; i++) {
            builder.append(characters[i].toUpperCase()).append(characters[i].toLowerCase().repeat(i));
            if (i != (characters.length - 1)) {
                builder.append("-");
            }
        }
        return builder.toString();
    }
}