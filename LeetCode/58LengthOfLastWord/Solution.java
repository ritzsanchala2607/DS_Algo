class Solution {
    public int lengthOfLastWord(String s) {
     int n=s.length();
        int count=0;
     for(int i=n-1;i>=0;i--){
        if(count==0 && s.charAt(i)==' '){
            continue;
        }else if(s.charAt(i)!=' '){
            count++;
        }
        else{
            break;
        }
     }  
     return count; 
    }
}