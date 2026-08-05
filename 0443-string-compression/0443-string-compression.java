class Solution 
{
    public int compress(char[] chars)
    {
        
        int readindex= 0;
        int writeindex= 0;


        while (readindex<chars.length)
        {
            int count  = 0;
            char currentchar = chars[readindex];

            while (readindex < chars.length && currentchar == chars[readindex])
            {
                count++;
                readindex++;
            }

            chars[writeindex] = currentchar;
            writeindex++;


            if (count>1)
            {
                String str = String.valueOf(count);
                for (char val: str.toCharArray())
                {
                    chars[writeindex] = val;

                    writeindex++;
                }
            }
        }
return writeindex;
        
    }
}