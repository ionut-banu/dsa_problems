package array_string;

class LengthOfLastWord {
    class Solution {
        public int lengthOfLastWord(String s) {
            int end = -1;
            for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(i) == ' ') {
                    if (end != -1) {
                        return end - i;
                    }
                } else {
                    if (end == -1) {
                        end = i;
                    }
                }
            }
            return end + 1;
        }
    }
}
