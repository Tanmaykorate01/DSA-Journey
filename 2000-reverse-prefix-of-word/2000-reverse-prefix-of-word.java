class Solution 
{
    public String reversePrefix(String word, char ch) 
    {
        
            Stack<Character> stack = new Stack();
              int  i =0;
              StringBuilder ans = new   StringBuilder();

        while(i<word.length())
        {
            if(word.charAt(i)==ch)
            {
                ans.append(word.charAt(i));
                 while(!stack.isEmpty())
                {
                    char a =  stack.pop();
                    ans.append(a);
                }
               return  ans.append(word.substring(i+1)).toString();
            }
            else
            {
                stack.push(word.charAt(i));
                i++;
            }
             
        }
        

        return word;
    }
}