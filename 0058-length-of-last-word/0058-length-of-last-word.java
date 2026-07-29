class Solution {
    public int lengthOfLastWord(String s) 
    {
         int count = 0;

        char arr[] = s.toCharArray();
        int i = arr.length-1;

            while (i>=0 && arr[i]==' ')
            {
                i--;

            }

            while (i>=0&& arr[i] !=' ')
            {
                count++;
                i--;
            }

            return count;

    }
}