import java.util.*;
import java.io.*;
import java.util.Random;


public class MaxPairwiseProduct {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in); // This line taken from given code in Coursera class
        int n = scanner.nextInt();
        long[] nums = new long[n];
        for (int i=0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
//        System.out.println(maxPairwiseProduct(nums));
        System.out.println();
        System.out.println(maxPairwiseProductFast(nums));
//        stressTest();
    }

// Method is used in stress test for solution
    public static long maxPairwiseProduct(long[] nums) {
        long max = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                max = Math.max(max, nums[i] * nums[j]);
            }
        }
        return max;
    }

    public static long maxPairwiseProductFast(long[] nums) {
        int first = -1;
        int second = -1;
        for (int i = 0; i < nums.length; i++) {
            if ((first == -1) || (nums[i] > nums[first])) {
                first = i;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if ((j != first) && ((second == -1) || (nums[j] > nums[second]))) {
                second = j;
            }
        }
        return  nums[first] * nums[second];
    }

//Code for FastScanner provided by Coursera Algorithmic Toolbox course
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch(Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
// Method used to test two solutions against each other
 /*   public static void stressTest() {
        while (true) {
            Random r = new Random();
            int low = 2;
            int high = 1000;
            int n = r.nextInt((high)) + low;

            long[] randArray = new long[n];
            for (int i = 0; i < randArray.length; i++) {
                randArray[i] = r.nextInt(100000);
            }
            System.out.println(n);
            for (int j = 0; j < randArray.length; j++) {
                System.out.print(randArray[j] + " ");
            }
            System.out.println();
            long slowMethod = maxPairwiseProduct(randArray);
            long fastMethod = maxPairwiseProductFast(randArray);
            if (slowMethod != fastMethod) {
                System.out.print("Wrong answer: " + slowMethod + " " + fastMethod);
                break;
            } else {
                System.out.println("OK");
                System.out.println();
            }
        }
    } */
}
