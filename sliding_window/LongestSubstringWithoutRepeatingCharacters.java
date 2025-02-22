package sliding_window;

import java.util.HashSet;
import java.util.Set;

class LongestSubstringWithoutRepeatingCharacters {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            int start = 0;
            int end = 0;
            int maxLength = 0;

            Set<Character> uniqueChars = new HashSet<>();

            while (end < s.length()) {
                if (!uniqueChars.contains(s.charAt(end))) {
                    uniqueChars.add(s.charAt(end));
                    end++;
                    if (uniqueChars.size() > maxLength) {
                        maxLength = uniqueChars.size();
                    }
                } else {
                    uniqueChars.remove(s.charAt(start));
                    start++;
                }
            }
            return maxLength;
        }
    }
}
