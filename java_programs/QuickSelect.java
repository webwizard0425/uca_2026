import java.util.Arrays;
import java.util.Random;

public class QuickSelect {

    private static final Random random = new Random();

    // Returns the smallest k elements in any order
    public static int[] smallestK(int[] arr, int k) {

        if (k <= 0)
            return new int[0];

        if (k >= arr.length)
            return arr.clone();

        // Place kth smallest element at index k-1
        quickSelect(arr, 0, arr.length - 1, k - 1);

        return Arrays.copyOf(arr, k);
    }


    private static void quickSelect(int[] arr, int left, int right, int k) {

        if (left >= right)
            return;


        int pivotIndex =
                left + random.nextInt(right - left + 1);


        pivotIndex = partition(arr, left, right, pivotIndex);


        if (k == pivotIndex) {
            return;
        }
        else if (k < pivotIndex) {
            quickSelect(arr, left, pivotIndex - 1, k);
        }
        else {
            quickSelect(arr, pivotIndex + 1, right, k);
        }
    }


    private static int partition(
            int[] arr,
            int left,
            int right,
            int pivotIndex) {


        int pivot = arr[pivotIndex];

        // Move pivot to end
        swap(arr, pivotIndex, right);

        int storeIndex = left;


        for (int i = left; i < right; i++) {

            if (arr[i] < pivot) {
                swap(arr, i, storeIndex);
                storeIndex++;
            }
        }


        // Move pivot to final location
        swap(arr, storeIndex, right);

        return storeIndex;
    }


    private static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {

        int[] data = {
            12, 5, 7, 3, 19,
            1, 8, 10, 4, 15
        };

        int k = 4;


        int[] result = smallestK(data, k);


        System.out.println(
            "Smallest " + k + " elements:"
        );

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}