import java.util.*;

public class countSmallerAfterSelf {

    static int[] ans;
    static int[] index;

    public static List<Integer> countSmaller(int[] nums) {

        int n = nums.length;

        ans = new int[n];
        index = new int[n];

        for (int i = 0; i < n; i++)
            index[i] = i;

        mergeSort(nums, 0, n - 1);

        List<Integer> result = new ArrayList<>();

        for (int x : ans)
            result.add(x);

        return result;
    }

    private static void mergeSort(int[] nums, int low, int high) {

        if (low >= high)
            return;

        int mid = low + (high - low) / 2;

        mergeSort(nums, low, mid);
        mergeSort(nums, mid + 1, high);

        merge(nums, low, mid, high);
    }

    private static void merge(int[] nums, int low, int mid, int high) {

        int[] tempIndex = new int[high - low + 1];

        int left = low;
        int right = mid + 1;
        int k = 0;
        int rightCount = 0;

        while (left <= mid && right <= high) {

            if (nums[index[right]] < nums[index[left]]) {

                tempIndex[k++] = index[right++];
                rightCount++;

            } else {

                ans[index[left]] += rightCount;
                tempIndex[k++] = index[left++];
            }
        }

        while (left <= mid) {

            ans[index[left]] += rightCount;
            tempIndex[k++] = index[left++];
        }

        while (right <= high) {

            tempIndex[k++] = index[right++];
        }

        for (int i = 0; i < tempIndex.length; i++)
            index[low + i] = tempIndex[i];
    }

    public static void main(String[] args) {

        int[] nums = {5, 2, 6, 1};

        System.out.println(countSmaller(nums));
    }
}