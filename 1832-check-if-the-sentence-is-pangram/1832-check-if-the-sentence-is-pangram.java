class Solution {
    public boolean checkIfPangram(String sentence)
     {
        HashSet<Character> hash = new HashSet();

        for(int i = 0;i<sentence.length();i++)
        {
            hash.add(sentence.charAt(i));
        }
        

        if(hash.size() == 26)
        return true;
        else
        return false;
    }
}