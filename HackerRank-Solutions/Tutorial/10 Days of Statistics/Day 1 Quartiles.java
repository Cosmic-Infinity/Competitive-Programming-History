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
     * Complete the 'quartiles' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> quartiles(List<Integer> arr) {
    // Write your code here
        Collections.sort(arr);
        int n = arr.size();
        int q2 = (n%2) == 0? (arr.get(n/2)+arr.get((n/2) -1))/2 : arr.get(n/2);
        
        int lh = n/2, uh = (n+1)/2;
        
        int q1 = (lh%2) == 0? (arr.get(lh/2)+arr.get((lh/2) -1))/2 : arr.get(lh/2);
        
        int q3 = ((uh+n)%2) == 0? (arr.get((uh+n)/2)+arr.get(((uh+n)/2) -1))/2 : arr.get((uh+n)/2);
        
        return Arrays.asList(q1,q2,q3);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> data = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> res = Result.quartiles(data);

        bufferedWriter.write(
            res.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
