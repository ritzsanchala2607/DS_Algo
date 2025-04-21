import java.io.*;

class Result {

    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
    // Write your code here
    s=s.toLowerCase();
    
    int[] freq=new int[26];
    int n=s.length();
    
    for(int i=0;i<n;i++){
        char ch=s.charAt(i);
        if(ch>='a' && ch<='z'){
            freq[ch-'a'] +=1;
        }
    }
    
    for(int i=0;i<26;i++)
        if(freq[i]<1){
            return "not pangram";
        }
    
    return "pangram";
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
