class Solution {
    public boolean checkIfPangram(String sentence) {
        int n=sentence.length();

        //if size is less than 26 means all letters of alphabets are not present 
        if(n<26){
            return false;
        }
        
        int[] count= new int[26];

        //Count the occurence and assign count of alphabet in array
        for(int i=0;i<n ;i++){
            int index= sentence.charAt(i)- 'a';
            count[index] +=1;
        }

        //check if any index of array is contain 0 or not
        for(int j=0; j< count.length;j++){
            if(count[j]==0) return false;
        }

        return true;
    }
}