public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String first = strs[0];

        for (int i = 0; i < first.length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || first.charAt(i) != strs[j].charAt(i)){
                    return first.substring(0, i);
                }
            }
        }

        return first;
    }
}
