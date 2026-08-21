class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) 
    {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList();
        List<Integer> output = new ArrayList();
        int index  = 0;

        solve(nums,index,ans,output);
        return ans;
        
    }
    static void solve(int nums[],int index,List<List<Integer>> ans,List<Integer> output)
    {
        if(index >= nums.length)
        {
            ans.add(new ArrayList<>(output));
            return;
        }

        int currentval = nums[index];

        output.add(currentval);

        //include call
        solve(nums,index+1,ans,output);

        //backtracking
        output.remove(output.size()-1);


    while(index+1 <nums.length && nums[index] == nums[index+1])
    {
        index++;
    }


        //excludecall
        solve(nums,index+1,ans,output);
    }
}