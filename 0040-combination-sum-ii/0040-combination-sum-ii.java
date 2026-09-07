class Solution {
    public void solve(int[] candidates,int target,int index ,List<List<Integer>> ans,List<Integer> output)
    {
        if(target == 0)
        {
            ans.add(new ArrayList<>(output));
            return;
        }
        if(target < 0)
        {
            return;
        }
        if(index >= candidates.length)
        {
            return;
        }

        output.add(candidates[index]);
        //include wala case 
        solve(candidates,target - candidates[index],index+1,ans,output);

        //backtracking wala step
        output.remove(output.size()-1);

    
        while(index+1 < candidates.length && candidates[index] == candidates[index+1])
        {
            index++;
        }

        //exclude
        solve(candidates,target,index+1,ans,output);

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) 
    {
        Arrays.sort(candidates);
        int index  = 0;
         List<List<Integer>> ans = new ArrayList();
         List<Integer> output = new ArrayList();

         solve(candidates,target,index,ans,output);
         return ans;
        
    }
}