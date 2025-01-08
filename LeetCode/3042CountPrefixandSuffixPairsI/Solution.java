class Solution {

    private static boolean isprefix(String s1, String s2){
       int m1=s1.length();
       int m2=s2.length();
    
       if(m1>m2) return false;

       for(int i=0 ;i<m1 ;i++){
        if(s1.charAt(i)!= s2.charAt(i)) return false;
       }
        return true;
    }

    private static boolean issufix(String s1, String s2){
        int m1=s1.length();
        int m2=s2.length();

        if(m1>m2) return false;

        for(int i=m1-1; i>=0 ;i--){
            if(s1.charAt(i)!= s2.charAt(m2 - (m1 - i))) return false;
        }
        return true;
    }

    public int countPrefixSuffixPairs(String[] words) {
        int len=words.length;
        int count=0;
        for(int i=0; i<len; i++){
            for(int j=i+1; j<len ;j++){
                if(isprefix(words[i],words[j]) && issufix(words[i],words[j])){
                count++;
            }
        }
        }
        return count;
    }
}