import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int sockMerchant(int n, int[] ar) {
         HashMap<Integer, Integer> map = new HashMap<>(); 
        int pairsOfSocks = 0;
        //original array looks like this [10, 20, 20, 10, 10, 30, 50, 10, 20]
        //This loop iterates through the array and adds each integer in the array to the hash map as a key with the value 0 looks like this  { 30:1, 50:1, 20:1} pairsOfSocks = 1 + 1 + 1
        for (int number : ar) {
            /*as each value from the array is being added to the hash map
            checking if the key already exists in the hashmap it will remove the pair and increment the pairOfSocks counter by 1. */
            if (map.containsKey(number)) {
                map.remove(number);
                pairsOfSocks++;
            } else 
            //If the key doesn't exist it will add the array element as the key with the value 1 using the put method map.put(key, value)
                map.put(number,1);
        }
        return pairsOfSocks;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
