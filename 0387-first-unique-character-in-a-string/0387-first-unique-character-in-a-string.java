    class Solution {
        public int firstUniqChar(String s) 
        {
            char arr[] = s.toCharArray();

            Map<Character,Integer> h1 = new HashMap<>();

            for (char t : arr)
            {
                h1.put(t, h1.getOrDefault(t,0)+1);

            }


            for (int i = 0;i<s.length();i++)
            {
                if (h1.get(arr[i])==1)
                {
                        return i;

                }
            }

                return -1;
            
        }
    }