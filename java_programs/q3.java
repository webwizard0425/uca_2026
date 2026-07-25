import java.util.*;
public class q3 {

    public static int longestConsecutive(int[] nums) {
        
        HashSet<Integer> st = new HashSet<>();

        for( int a: nums ) {
            st.add(a);
        }
        int ans = 0;
        int mxans = 0;
        for(int a : st ){
            if(!st.contains(a-1)){
                while(st.contains(a+1)){
                  //  st.remove(a+1);
                    a++;
                    ans++;
                }
                mxans = Math.max(ans,mxans);
            }
        }
        return mxans;
    }

    public static void main(String[] args) {

        // Example input
        int[] nums = {0,3,7,2,5,8,4,5,0,6,1 };

        // Call the method
        int result = longestConsecutive(nums);

        // Print the result
        System.out.println(result);
    }
}