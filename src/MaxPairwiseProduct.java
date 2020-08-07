import java.util.*;
import java.io.*;


public class MaxPairwiseProduct {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in); // This line taken from given code in Coursera class
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i=0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println(maxPairwiseProduct(nums));
    }

    public static int maxPairwiseProduct(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                max = Math.max(max, nums[i] * nums[j]);
            }
        }
        return max;
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
}
