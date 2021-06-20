import java.util.*;
import java.io.*;

//Starter Code:

public class MaxPairwiseProduct {
    static int getMaxPairwiseProduct(int[] numbers)
    {
        int max_product = 0;
        int n = numbers.length;

        for (int first = 0; first < n; ++first)
        {
            for (int second = first + 1; second < n; ++second) 
            {
                max_product = Math.max(max_product, numbers[first] * numbers[second]);
            }
        }

        return max_product;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++)
        {
            numbers[i] = scanner.nextInt();
        }

        int temp = 0;
        for (int i = 1; i < numbers.length; i++)
        {
            for (int j = i; j > 0; j--)
            {
                if (numbers[j] < numbers[j - 1])
                {
                    temp = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = temp;
                }
            }
        }

        System.out.println(getMaxPairwiseProduct(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                    InputStreamReader(stream));
            } catch (Exception e) {
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
