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

    public static int connectedCell(List<List<Integer>> matrix) {
        int rows = matrix.size();
        int cols = matrix.get(0).size();
        boolean[][] visited = new boolean[rows][cols];

        int maxRegion = 0;

        // DFS helper function
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix.get(i).get(j) == 1 && !visited[i][j]) {
                    int regionSize = dfs(matrix, visited, i, j);
                    maxRegion = Math.max(maxRegion, regionSize);
                }
            }
        }

        return maxRegion;
    }

    private static int dfs(List<List<Integer>> matrix, boolean[][] visited, int i, int j) {
        int rows = matrix.size();
        int cols = matrix.get(0).size();

        // Out of bounds or already visited or not filled
        if (i < 0 || i >= rows || j < 0 || j >= cols || visited[i][j] || matrix.get(i).get(j) == 0) {
            return 0;
        }

        visited[i][j] = true;
        int count = 1;

        // Explore all 8 directions
        for (int dx = -1; dx <= 1; dx++) {
            for (int dy = -1; dy <= 1; dy++) {
                if (!(dx == 0 && dy == 0)) {
                    count += dfs(matrix, visited, i + dx, j + dy);
                }
            }
        }

        return count;
    }
}

public class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> matrix = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                matrix.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.connectedCell(matrix);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
