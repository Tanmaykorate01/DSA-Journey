class Solution {
    public String clearDigits(String s) 
    {
        Stack<Character> stack = new Stack();
        StringBuilder  ans =  new StringBuilder();

        for(int i=0;i<s.length();i++)
        {
            char ch =  s.charAt(i);

            if( !stack.isEmpty() && Character.isDigit(ch))
            {
                stack.pop();
                
            }
            else
            {
                 stack.push(ch);
            }

        }
                for(char ch: stack)
                {
                    ans.append(ch);
                }

        return ans.toString();
    }
}