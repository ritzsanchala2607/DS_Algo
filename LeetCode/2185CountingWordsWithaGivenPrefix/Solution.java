public class Solution {
    private boolean prefix(String s1, String ref){
        int n=ref.length();
        int m=s1.length();

        //pref size is > word than return false
        if(n>m) return false;

        //if character no match than return false
        for(int i=0;i<n;i++){
            if(s1.charAt(i) != ref.charAt(i)) return false;
        }

        return true;
    }
    public int prefixCount(String[] words, String pref) {
        int n=words.length;
        int count=0;

        for(int i=0; i<n; i++){
        if(prefix(words[i],pref)) count++;
        }

        return count;
    }
}