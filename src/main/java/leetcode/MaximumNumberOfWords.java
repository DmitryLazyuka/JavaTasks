package leetcode;

public class MaximumNumberOfWords {
    public static int mostWordsFound(String[] sentences) {

        int maxLength = 0;

        for (String sentence : sentences) {
            maxLength = Math.max((sentence.length() - sentence.replace(" ", "").length() + 1), maxLength);
        }
        return maxLength;
    }
}
