class Solution {
    public int[] dailyTemperatures(int[] temperatures) 
    {

     Stack<Integer> stack = new Stack();
     int answer[] = new int[temperatures.length];
for(int i = 0;i<temperatures.length;i++)
{
    
     while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()])
     {
        int previous = stack.pop();
        int ans = i - previous;
        answer[previous] = ans;
        

     }
     
        stack.push(i);
        
    }
        return answer;
    }
}