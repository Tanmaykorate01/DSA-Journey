class Solution {

    public static int PivotindexofClass(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
        int n = nums.length - 1;
        int index = 0;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] > nums[n]) {
                index = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return index;
    }

    public static int Searchs(int[] nums, int target, int stratidx, int endidx) {
        int strat = stratidx;
        int end = endidx;
        int pos = -1;

        while (strat <= end) {
            int mid = strat + (end - strat) / 2;

            if (nums[mid] == target) {
                pos = mid;
                break;
            } else if (nums[mid] < target) {
                strat = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return pos;
    }

    public int search(int[] nums, int target) {

        int ans = 0;
        int pivot = PivotindexofClass(nums);

        int startarr1 = 0;
        int endarr1 = pivot;

        int startarr2 = pivot + 1;
        int endarr2 = nums.length - 1;

        if (nums[startarr1] <= target && nums[endarr1] >= target) {
            ans = Searchs(nums, target, startarr1, endarr1);
            return ans;
        } else {
            ans = Searchs(nums, target, startarr2, endarr2);
            return ans;
        }
    }
}