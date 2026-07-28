class Solution {
    public int findContentChildren(int[] g, int[] s) 
    {
         Arrays.sort(g);
        Arrays.sort(s);
        int count  = 0;
        int i = 0;
        int j = 0;
        int n  = g.length-1;
        int m = s.length-1;
        while (j<=m&&i<=n)
        {
            if (g[i]<=s[j])
            {
                count++;
                i++;
                j++;
            }
            else
            {
                j++;
            }
        }
        return count;
        
    }
}