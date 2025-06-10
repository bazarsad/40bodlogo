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
     * Complete the 'lilysHomework' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

   public static int lilysHomework(List<Integer> arr) {
    List<Integer> sortedAsc = new ArrayList<>(arr);
    Collections.sort(sortedAsc);

    List<Integer> sortedDesc = new ArrayList<>(sortedAsc);
    Collections.reverse(sortedDesc);

    int swapsAsc = minSwaps(arr, sortedAsc);
    int swapsDesc = minSwaps(arr, sortedDesc);

    return Math.min(swapsAsc, swapsDesc);
}

private static int minSwaps(List<Integer> original, List<Integer> target) {
    int n = original.size();
    Map<Integer, Integer> indexMap = new HashMap<>();
    for (int i = 0; i < n; i++) {
        indexMap.put(original.get(i), i);
    }

    int swaps = 0;
    List<Integer> arr = new ArrayList<>(original);

    for (int i = 0; i < n; i++) {
        int correctValue = target.get(i);
        if (!arr.get(i).equals(correctValue)) {
            swaps++;

            int toSwapIdx = indexMap.get(correctValue);

            // Update the index map after swap
            indexMap.put(arr.get(i), toSwapIdx);
            indexMap.put(correctValue, i);

            // Perform swap
            Collections.swap(arr, i, toSwapIdx);
        }
    }
    return swaps;
    }

}

public class Solution7 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.lilysHomework(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
