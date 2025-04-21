import java.io.*;

class Result {

    /*
     * Complete the 'marsExploration' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int marsExploration(String s) {
    // Write your code here
    int n=s.length();
    int totalSOS=n/3;
    int diffCount=0;
    String sentMsg="";
    //Created a sent msg stirng
    for(int i=0; i<totalSOS;i++){
        sentMsg+="SOS";
    }
    
    //Now Comparison with received msg
    for(int i=0;i<n;i++){
        if(sentMsg.charAt(i)!= s.charAt(i)){
            diffCount++;
        }
    }
    
    return diffCount;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int result = Result.marsExploration(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
