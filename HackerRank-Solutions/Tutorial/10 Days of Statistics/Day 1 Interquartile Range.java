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
     * Complete the 'interQuartile' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY values
     *  2. INTEGER_ARRAY freqs
     */

    public static void interQuartile(List<Integer> values, List<Integer> freqs) {
    // Print your answer to 1 decimal place within this function
        List<Integer> vals = new ArrayList<Integer>();
        for(int i=0; i<values.size(); i++){
            for(int j=0; j<freqs.get(i); j++){
                vals.add(values.get(i));
            }
        }
        
        Collections.sort(vals);
        int n = vals.size();
        // int q2 = (n%2) == 0? (arr.get(n/2)+arr.get((n/2) -1))/2 : arr.get(n/2);
        
        int lh = n/2, uh = (n+1)/2;
        
        float q1 = (lh%2) == 0? (vals.get(lh/2)+vals.get((lh/2) -1))/2f : vals.get(lh/2);
        
        float q3 = ((uh+n)%2) == 0? (vals.get((uh+n)/2)+vals.get(((uh+n)/2) -1))/2f : vals.get((uh+n)/2);
        
        System.out.format("%.1f",q3-q1);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> val = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> freq = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.interQuartile(val, freq);

        bufferedReader.close();
    }
}
