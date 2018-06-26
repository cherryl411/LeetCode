import java.util.HashMap;
import java.util.Map;

public class LongestNoRepSub {

    public static void main(String[] args){
        System.out.println(lengthOfLongestSubstring("abshdenabdhwmab"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int result = 0;
        if (s == null || s.length() < 1){
            return result;
        }
        Map<Character, Integer> charIndexMap = new HashMap<>();
        int j = 0;
        for (int i = 0; i < s.length(); i++){
            if (charIndexMap.containsKey(s.charAt(i))){
                j = Math.max(charIndexMap.get(s.charAt(i)) + 1, j);
            }
            charIndexMap.put(s.charAt(i), i);
            result = Math.max(result, i - j + 1);
        }


        return result;
    }
}
