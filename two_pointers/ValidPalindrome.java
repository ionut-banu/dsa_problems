package two_pointers;

class ValidPalindrome {
    class Solution {
        public boolean isPalindrome(String s) {
            s = s.replaceAll("[^a-zA-Z0-9]", "")
                .replace(" ", "")
                .toLowerCase();

            if (s.equals(" ")) {
                return true;
            }

            int L = 0;
            int R = s.length() - 1;

            while (L < R) {
                if (s.charAt(L) != s.charAt(R)) {
                    return false;
                }
                L++;
                R--;
            }
            return true;
        }
    }
}