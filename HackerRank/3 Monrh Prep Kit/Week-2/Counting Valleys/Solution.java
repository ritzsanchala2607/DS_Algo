import java.io.*;

class Result {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

     public static int countingValleys(int steps, String path) {
        int level = 0;      // current level
        int valleys = 0;    // valley count

        for (int i = 0; i < steps; i++) {
            char step = path.charAt(i);

            // Before updating level, check if we're stepping up to sea level
            if (step == 'U') {
                level++;
                if (level == 0) {
                    valleys++;  // we just came up from a valley
                }
            } else {
                level--;
            }
        }

        return valleys;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = Result.countingValleys(steps, path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
        
        
    }
}
