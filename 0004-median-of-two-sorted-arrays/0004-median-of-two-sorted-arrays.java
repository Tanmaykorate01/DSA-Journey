class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int[] merged = new int[m + n];

        int i = 0, j = 0, k = 0;

        // Merge both arrays
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }

        // Remaining elements of nums1
        while (i < m) {
            merged[k++] = nums1[i++];
        }

        // Remaining elements of nums2
        while (j < n) {
            merged[k++] = nums2[j++];
        }

        int total = m + n;

        // If total elements are odd
        if (total % 2 == 1) {
            return merged[total / 2];
        }

        // If total elements are even
        return (merged[total / 2 - 1] + merged[total / 2]) / 2.0;
    }
}