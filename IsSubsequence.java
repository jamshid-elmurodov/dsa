public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        char[] charsS = s.toCharArray();
        char[] charsT = t.toCharArray();

        int l = 0;
        int r = 0;

        while (l < charsS.length && r < charsT.length){
            if (charsS[l] == charsT[r]){
                l++;
            }

            r++;
        }

        return l == charsS.length;
    }
}
