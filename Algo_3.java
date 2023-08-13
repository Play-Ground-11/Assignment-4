import java.util.Arrays;

public class Algo_3 {
    public static void main(String[] args) {

        int[] nums = {10, 20, 30, 40, 50};

        int n = nums.length;
        int[] temp = new int[n];

        for (int i = n-1; i >-1; i--) {
            temp[n-i-1] = nums[i];
        }
        nums = temp;
        System.out.println("Reversed Array :"+Arrays.toString(nums));
    }
    
}
