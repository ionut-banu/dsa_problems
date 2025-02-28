package hashmap;

import java.util.HashMap;
import java.util.Map;

class RansomNote {
    class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {

            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < magazine.length(); i++) {
                char letter = magazine.charAt(i);
                if (map.containsKey(letter)) {
                    map.put(letter, map.get(letter) + 1);
                } else {
                    map.put(letter, 1);
                }
            }

            for (int i = 0; i < ransomNote.length(); i++) {
                char letter = ransomNote.charAt(i);
                if (!map.containsKey(letter)) {
                    return false;
                }
                int number = map.get(letter) - 1;
                if (number == 0) {
                    map.remove(letter);
                } else {
                    map.put(letter, number);
                }
            }

            return true;
        }
    }
}
