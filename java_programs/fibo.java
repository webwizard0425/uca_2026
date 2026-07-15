import java.util.Scanner;

public class EvenFibonacciSum {

    
    public static long evenFibSumBruteForce(int n) {
        long a = 1;
        long b = 1;
        long sum = 0;

        while (b <= n) {
            if (b % 2 == 0) {
                sum += b;
            }

            long next = a + b;
            a = b;
            b = next;
        }

        return sum;
    }


    public static long evenFibSumOptimized(int n) {
        long sum = 0;

        long prevEven = 2;
        long currEven = 8;

        while (prevEven <= n) {
            sum += prevEven;

            long nextEven = 4 * currEven + prevEven;
            prevEven = currEven;
            currEven = nextEven;
        }

        return sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println("Brute Force Output: " + evenFibSumBruteForce(n));
        System.out.println("Optimized Output: " + evenFibSumOptimized(n));

        sc.close();
    }
}