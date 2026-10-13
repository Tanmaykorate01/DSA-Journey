class Solution {
    static boolean issafetoplace(int rowindex,int colindex,int  n , char[][] boards)
    {
        int row = rowindex;
        int col =  colindex;

        while(col >= 0)
        {
            if(boards[row][col] == 'Q')
            {
                return false;
            }
            col--;
        }


        row = rowindex;
        col = colindex;


        while(row>=0 && col >=0)
        {
            if(boards[row][col] == 'Q')
            {
                return false;

            }

            row--;
            col--;
        }

        row = rowindex;
        col  = colindex;

        while(col >= 0 && row < n)
        {
            if(boards[row][col] == 'Q')
            {
                return false;
            }

            row = row+1;
            col = col -1;
        }



        return true;
    }
    static void solve(char boards[][],int colindex,int n,List<List<String>> ans)
    {
        if(colindex>=n)
        {
            List<String> temp = new ArrayList();
            for(int i=0;i<n;i++)
            {
                temp.add(new String(boards[i]));
            }
            ans.add(temp);
            return;
        }


        for(int rowindex = 0; rowindex < n; rowindex++)
        {
            if(issafetoplace(rowindex,colindex,n,boards))
            {
                boards[rowindex][colindex] ='Q';

                solve(boards,colindex+1,n,ans);


                //backtracking
                 boards[rowindex][colindex] ='.';

            }
        }
    }
    public List<List<String>> solveNQueens(int n)
    {
        char[][] boards = new char[n][n];

        for(int i=0;i<n;i++)
        {
            Arrays.fill(boards[i],'.');
        }
        int colindex = 0;
        List<List<String>> ans = new ArrayList();
        solve(boards,colindex,n,ans);
        return ans;

                
    }
}