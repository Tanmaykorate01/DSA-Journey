class Solution {
    public int maxRepeating(String sequence, String word) 
    {

        int count  = 0;
        String repeated = "";

        while(sequence.contains(repeated +word))
        {
            count++;
            repeated = repeated + word;
        }
        return count;
    }
}
