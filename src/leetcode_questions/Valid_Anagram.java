package leetcode_questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Valid_Anagram {
    public boolean isAnagram(String s, String t) {

        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);
        return Arrays.equals(sChar, tChar);

    }

}
