public class Accumul {

    public static String accum(String s) {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            String character = s.substring(i, i + 1);
            builder.append(character.toUpperCase()).append(character.toLowerCase().repeat(i));
            if (i != (s.length()) - 1) {
                builder.append("-");
            }
        }
        return builder.toString();
    }
}