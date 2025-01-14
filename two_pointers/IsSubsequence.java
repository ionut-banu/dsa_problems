class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.equals("") && t.equals("")) {
            return true;
        } else if (t.equals("")) {
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

        if (sIndex == s.length()) {
            return true;
        }

        return false;
    }
}
