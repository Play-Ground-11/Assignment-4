import java.util.Scanner;

public class Algo_2 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        int[] nums = {-5, 2, 7, 10, 58, -7, 8, 23};

        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
               if( nums[i] > max){
                max = nums[i];
               } 
        }
        System.out.println("Largest element present in given array: "+max);
       
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < min){
                min = nums[i];
            }
        }

        System.out.println("Smallest element present in given array: "+min);
    }
}
    
