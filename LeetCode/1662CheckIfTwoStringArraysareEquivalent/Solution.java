class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        //storing length of both array
        int size1=word1.length;
        int size2=word2.length;

        String s1="";
        String s2="";
        
        //append each element of word1 to String s1
        for(int i=0; i<size1; i++){
            s1 += word1[i];
        }

        //append each element of word2 to String s2
        for(int j=0; j<size2; j++){
            s2 += word2[j];
        }

        //checking s1 and s2 are equals or not
        if(s1.equals(s2)){// both equals return ture
            return true;
        } 
        //else return false
        return false;
    }
}