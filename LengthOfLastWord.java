public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String trimmed = s.trim();

        int i = trimmed.lastIndexOf(" ");

        return s.substring(i + 1).length();
    }
}
