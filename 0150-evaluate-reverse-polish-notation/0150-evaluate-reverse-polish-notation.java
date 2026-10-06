class Solution {
    public int evalRPN(String[] tokens) 
    {

        Stack<Integer> stack = new Stack();
        for(int i =0;i<tokens.length;i++)
        {
           
            String token = tokens[i];

            if((token.equals("+"))||(token.equals("-"))||(token.equals("*"))||(token.equals("/")))
            {

                    if(token.equals("+"))
                    {
                        if(stack.size()>0)
                        {
                            int first = stack.pop();
                            int second = stack.pop();
                            stack.push(first + second);
                        
                        }
                    
                    }
                    if(token.equals("-"))
                    {
                        if(stack.size()>0)
                        {
                            int first = stack.pop();
                            int second = stack.pop();
                            stack.push(second-first);
                            
                        }
                        
                    }
                    if(token.equals("/"))
                    {

                        if(stack.size()>0)
                        {
                            int first = stack.pop();
                            int second = stack.pop();
                            stack.push(second/first);
                            
                        }
                    
                            
                    }
                    if(token.equals("*"))
                    {
                        if(stack.size()>0)
                        {
                            int first = stack.pop();
                            int second = stack.pop();
                            stack.push(first * second);
                        } 
                    }
            }
            else
            {
                int number = Integer.parseInt(token);
                stack.push(number);
            }
    
        }

         
         return stack.pop();
    }
}
