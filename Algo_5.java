import java.util.Scanner;

public class Algo_5 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String text;
        
        do{
            System.out.println("Enter a text: ");
            text = scanner.nextLine().strip();

            if(!text.isBlank()){
             boolean isASCII = true;
                for (int i = 0; i < (text.length()-1); i++) {
                int c = text.charAt(i);
                if(c >0x7F){
                    isASCII = false;
                    break;
            }
        }
            if(isASCII){
                char[] charArray = text.toCharArray();

                for (int i = charArray.length - 1; i >=0; i--) {
                    System.out.print(charArray[i]);
                }
            }
            System.out.println();
        }else{
            System.out.println("Invlid text.");
            }
        }while(text.isBlank());
        
    }
    
}
