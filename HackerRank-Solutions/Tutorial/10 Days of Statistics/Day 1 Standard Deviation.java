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
     * Complete the 'stdDev' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void stdDev(List<Integer> arr) {
    // Print your answers to 1 decimal place within this function
        int n=arr.size(), sum=0;
        for(int i=0; i<n; i++){
            sum+=arr.get(i);
        }
        float mean = sum/(float)n;
        float sum2=0;
        for(int i=0; i<n; i++){
            sum2+= Math.pow((arr.get(i)-mean),2);
        }
        System.out.println(Math.sqrt(sum2/n));
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> vals = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.stdDev(vals);

        bufferedReader.close();
    }
}
