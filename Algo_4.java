import java.util.Arrays;

public class Algo_4 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};

        for (int i = 0; i < nums.length/2; i++) {
            int j = nums[i];
            nums[i] =nums[nums.length - i - 1];
            nums[nums.length-i-1] = j;
        }
        System.out.println("Reversed Array :"+ Arrays.toString(nums));
    }
    
}