import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'timeInWords' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER h
     *  2. INTEGER m
     */
    public static String timeInWords(int h, int m) {
    String[] numbers = {
        "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
        "eleven", "twelve", "thirteen", "fourteen", "quarter", "sixteen", "seventeen", 
        "eighteen", "nineteen", "twenty", "twenty one", "twenty two", "twenty three", 
        "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight", 
        "twenty nine", "half"
    };

    if (m == 0) {
        return numbers[h] + " o' clock";
    } else if (m == 15 || m == 30) {
        return numbers[m] + " past " + numbers[h];
    } else if (m == 45) {
        return "quarter to " + numbers[h == 12 ? 1 : h + 1];
    } else if (m < 30) {
        String minuteWord = m == 1 ? "minute" : "minutes";
        return numbers[m] + " " + minuteWord + " past " + numbers[h];
    } else {
        int minutesTo = 60 - m;
        String minuteWord = minutesTo == 1 ? "minute" : "minutes";
        return numbers[minutesTo] + " " + minuteWord + " to " + numbers[h == 12 ? 1 : h + 1];
    }
}


    }


public class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int h = Integer.parseInt(bufferedReader.readLine().trim());

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.timeInWords(h, m);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
