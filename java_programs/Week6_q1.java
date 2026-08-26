public class Week6_q1 {

    public static int findNumber(int[] arr) {
        int result = 0;

        // Java int has 32 bits
        for (int bit = 0; bit < 32; bit++) {
            int count = 0;

            for (int num : arr) {
                if ((num & (1 << bit)) != 0) {
                    count++;
                }
            }

            // Every normal number contributes 3 times.
            // The extra number contributes 1 additional time.
            if (count % 3 != 0) {
                result |= (1 << bit);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {
            1, 2, 3, 4,
            1, 2, 4, 1, 2,
            3, 4, 3, 3
        };

        System.out.println(findNumber(arr));
    }
}
