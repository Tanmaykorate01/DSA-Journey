class Solution {
    public static void solve(String digits,String[] mapping,int index,List<String> result, StringBuilder output)
     {
        //basecase 
        if(index >= digits.length())
        {
            result.add(output.toString());
            return;
        }

        int value = digits.charAt(index) - '0';
        String mappingstring =  mapping[value];
        


        for(int i= 0;i<mappingstring.length();i++)
        {
            output.append(mappingstring.charAt(i));

            // recursion sambhal legaaa

            solve(digits,mapping,index+1,result,output);

            //backtracking step

            output.deleteCharAt(output.length()-1);
        }
     }
    public List<String> letterCombinations(String digits) 
    {
        String mapping[] = {"","" ,"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};   
        int index = 0;
        List<String> result = new ArrayList();
        StringBuilder output = new StringBuilder();
        solve(digits,mapping,index,result,output);
        return result;     
    }
}