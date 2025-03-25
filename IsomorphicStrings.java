import java.util.HashMap;
import java.util.Objects;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        char[] charsS = s.toCharArray();
        char[] charsT = t.toCharArray();

        HashMap<Character, Character> map = new HashMap<>();
//        add, egg

        for (int i = 0; i < charsS.length; i++) {
            if (map.containsKey(charsS[i])){
                if (!Objects.equals(map.get(charsS[i]), charsT[i])) return false;
            } else if (map.containsValue(charsT[i])){
                return false;
            }
//            a - e, d - g,
            map.put(charsS[i], charsT[i]);
        }

        return true;
    }
}
