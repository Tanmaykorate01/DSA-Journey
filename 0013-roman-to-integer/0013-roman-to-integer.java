class Solution
 {
    public int romanToInt(String s) 
    {
        HashMap<Character, Integer> map = new HashMap<>();

                map.put('I', 1);
                map.put('V', 5);
                map.put('X', 10);
                map.put('L', 50);
                map.put('C', 100);
                map.put('D', 500);
                map.put('M', 1000);

                int ans  = 0;

                for(int i = 0;i<s.length()-1;i++)
                {
                    char current  =  s.charAt(i);
                    char next = s.charAt(i+1);

                    if(map.get(current)>= map.get(next))
                    {
                        ans += map.get(current);
                    }
                    else
                    {
                        ans -= map.get(current);
                    }
                }
           return     ans += map.get(s.charAt(s.length() - 1));
    }
}