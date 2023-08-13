import java.util.Scanner;

public class Algo_1{
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        do{
            System.out.print("Input a number: ");
            int number = scanner.nextInt();
            scanner.nextLine();

            int firstTerm = 0;
            int secondTerm =1;
            int n = number;
            if(number >= 0){
                
                while(firstTerm <= n){
                    System.out.print(firstTerm + ",");
                    int nextTerm = firstTerm + secondTerm;
                    firstTerm = secondTerm;
                    secondTerm = nextTerm;

                }
            }
            System.out.println();
        }while(true);
    }
}