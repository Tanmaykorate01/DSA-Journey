import java.util.*;

class Solution {

    public int[] validSequence(String word1, String word2) {

        int n = word1.length();
        int m = word2.length();

        // Store positions of every character in word1
        List<Integer>[] pos = new ArrayList[26];

        for (int i = 0; i < 26; i++) {
            pos[i] = new ArrayList<>();
        }

        for (int i = 0; i < n; i++) {
            pos[word1.charAt(i) - 'a'].add(i);
        }

        /*
         * exact[j] =
         * rightmost position where word2[j...] can start
         * if we need an EXACT match.
         *
         * almost[j] =
         * rightmost position where word2[j...] can start
         * if we allow at most ONE mismatch.
         */
        int[] exact = new int[m + 1];
        int[] almost = new int[m + 1];

        exact[m] = n;
        almost[m] = n;

        // Previous position having a different character
        int[] prevDiff = new int[n];

        Arrays.fill(prevDiff, -1);

        for (int i = 1; i < n; i++) {
            if (word1.charAt(i - 1) != word1.charAt(i)) {
                prevDiff[i] = i - 1;
            } else {
                prevDiff[i] = prevDiff[i - 1];
            }
        }

        // Build exact[] and almost[] from right to left
        for (int j = m - 1; j >= 0; j--) {

            char target = word2.charAt(j);

            // Exact match
            exact[j] = getPreviousSame(
                    pos[target - 'a'],
                    exact[j + 1]
            );

            // Option 1:
            // Current character matches, mismatch can happen later.
            int same = getPreviousSame(
                    pos[target - 'a'],
                    almost[j + 1]
            );

            // Option 2:
            // Current character is the one mismatch.
            int different = getPreviousDifferent(
                    word1,
                    prevDiff,
                    target,
                    exact[j + 1]
            );

            almost[j] = Math.max(same, different);
        }

        // Next position having a different character
        int[] nextDiff = new int[n];

        Arrays.fill(nextDiff, -1);

        for (int i = n - 2; i >= 0; i--) {

            if (word1.charAt(i + 1) != word1.charAt(i)) {
                nextDiff[i] = i + 1;
            } else {
                nextDiff[i] = nextDiff[i + 1];
            }
        }

        int[] ans = new int[m];

        int prev = -1;
        boolean usedMismatch = false;

        /*
         * Greedily choose the smallest possible index.
         */
        for (int j = 0; j < m; j++) {

            char target = word2.charAt(j);

            if (usedMismatch) {

                // No mismatch left.
                // Therefore everything must match exactly.

                int candidate = getNextSame(
                        pos[target - 'a'],
                        prev
                );

                if (candidate == -1 ||
                    exact[j + 1] == -1 ||
                    candidate >= exact[j + 1]) {

                    return new int[0];
                }

                ans[j] = candidate;
                prev = candidate;

            } else {

                /*
                 * Option 1:
                 * Current character matches.
                 * We can still use mismatch later.
                 */
                int sameCandidate = getNextSame(
                        pos[target - 'a'],
                        prev
                );

                if (sameCandidate == -1 ||
                    almost[j + 1] == -1 ||
                    sameCandidate >= almost[j + 1]) {

                    sameCandidate = -1;
                }

                /*
                 * Option 2:
                 * Current character is the one mismatch.
                 */
                int differentCandidate = getNextDifferent(
                        word1,
                        nextDiff,
                        target,
                        prev
                );

                if (differentCandidate == -1 ||
                    exact[j + 1] == -1 ||
                    differentCandidate >= exact[j + 1]) {

                    differentCandidate = -1;
                }

                if (sameCandidate == -1 &&
                    differentCandidate == -1) {

                    return new int[0];
                }

                /*
                 * We need the smallest index because
                 * the answer must be lexicographically smallest.
                 */
                if (differentCandidate == -1 ||
                    (sameCandidate != -1 &&
                     sameCandidate < differentCandidate)) {

                    ans[j] = sameCandidate;
                    prev = sameCandidate;

                } else {

                    ans[j] = differentCandidate;
                    prev = differentCandidate;

                    usedMismatch = true;
                }
            }
        }

        return ans;
    }

    // Rightmost occurrence of target before boundary
    private int getPreviousSame(
            List<Integer> list,
            int boundary) {

        if (boundary <= 0) {
            return -1;
        }

        int left = 0;
        int right = list.size() - 1;
        int answer = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (list.get(mid) < boundary) {
                answer = list.get(mid);
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return answer;
    }

    // Rightmost character different from target before boundary
    private int getPreviousDifferent(
            String word1,
            int[] prevDiff,
            char target,
            int boundary) {

        if (boundary <= 0) {
            return -1;
        }

        int i = boundary - 1;

        if (word1.charAt(i) != target) {
            return i;
        }

        return prevDiff[i];
    }

    // Smallest occurrence of target after prev
    private int getNextSame(
            List<Integer> list,
            int prev) {

        int left = 0;
        int right = list.size() - 1;
        int answer = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (list.get(mid) > prev) {
                answer = list.get(mid);
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return answer;
    }

    // Smallest character different from target after prev
    private int getNextDifferent(
            String word1,
            int[] nextDiff,
            char target,
            int prev) {

        int i = prev + 1;

        if (i >= word1.length()) {
            return -1;
        }

        if (word1.charAt(i) != target) {
            return i;
        }

        return nextDiff[i];
    }
}