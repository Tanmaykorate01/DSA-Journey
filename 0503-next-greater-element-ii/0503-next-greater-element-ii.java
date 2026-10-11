class Solution {
    public int[] nextGreaterElements(int[] nums) 
    {
    //   HashMap<Integer,Integer> map = new HashMap();
      Stack<Integer> stack = new Stack();
      int ans[] = new int[nums.length];

      for(int i = 2*nums.length-1;i>=0;i--)
      {
        int index = i % nums.length;

        while(!stack.isEmpty()&&stack.peek()<=nums[index])
        {
            stack.pop();
        }

        if(stack.isEmpty())
        {
            ans[index] = -1;
        }
        else
            {
           ans[index] = stack.peek();

               }

               stack.push(nums[index]);

      }  


            return ans;
    }
}