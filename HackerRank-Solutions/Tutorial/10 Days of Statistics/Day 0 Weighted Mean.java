import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'weightedMean' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY X
     *  2. INTEGER_ARRAY W
     */

    public static void weightedMean(List<Integer> X, List<Integer> W) {
    // Write your code here
    float sum = 0, count = 0;
    for(int i=0; i<X.size(); i++){
       sum+=X.get(i)*W.get(i);
       count+=W.get(i); 
    }
    float res  = sum/count;
    res=Math.round(res*10);
    System.out.format("%.1f",res/10);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> vals = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> weights = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.weightedMean(vals, weights);

        bufferedReader.close();
    }
}
