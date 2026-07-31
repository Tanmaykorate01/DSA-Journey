class Solution {

    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        String ans = "";

        // Traverse each character of the first string
        for (int j = 0; j < strs[0].length(); j++) {

            char ch = strs[0].charAt(j);

            // Compare this character with every other string
            for (int i = 1; i < strs.length; i++) {

                // If current string is shorter OR character doesn't match
                if (j >= strs[i].length() || strs[i].charAt(j) != ch) {
                    return ans;
                }
            }

            // All strings have the same character at position j
            ans += ch;
        }

        return ans;
    }
}