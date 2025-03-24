import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        return Arrays.equals(counter(s), counter(t));
    }

    private int[] counter(String s) {
        int[] res = new int[26];

        char[] chars = s.toCharArray();

        for (char c : chars) {
            res[c]++;
        }

        return res;
    }
}
