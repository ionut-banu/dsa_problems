package two_pointers;

class IsSubsequence {
    class Solution {
        public boolean isSubsequence(String s, String t) {
            if (s.isEmpty() && t.isEmpty()) {
                return true;
            } else if (t.isEmpty()) {
                return false;
            }

            if (s.length() > t.length()) {
                return false;
            }

            int sIndex = 0;
            int tIndex = 0;

            while (sIndex < s.length() && tIndex < t.length()) {
                if (s.charAt(sIndex) == t.charAt(tIndex)) {
                    sIndex++;
                }
                tIndex++;
            }

            return sIndex == s.length();
        }
    }
}
