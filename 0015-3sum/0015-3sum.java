class Solution {
    public List<List<Integer>> threeSum(int[] nums) 
    {
       Arrays.sort(nums);
        int n =nums.length;
        List<List<Integer>> output = new ArrayList<>();

            for (int i = 0; i < nums.length; i++)
            {
                if (i > 0 && nums[i] == nums[i - 1])
                    continue;

                int fix = nums[i];
                int left = i + 1;
                int right = nums.length - 1;
                while(left<right)
                {

                if (nums[left] + nums[right] == -fix)
                {
                    output.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
                else {
                    if (nums[left] + nums[right] < -fix) {
                        left++;

                    } else {
                        right--;
                    }


                }
            }
        }

        return (output);
    }
}