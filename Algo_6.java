import java.util.Scanner;

public class Algo_6 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       
        String sentence;
        
        do{
            System.out.println("Enter a Sentence: ");
            sentence = scanner.nextLine().strip();

            if(!sentence.isBlank()){
             boolean isASCII = true;
                for (int i = 0; i < (sentence.length()-1); i++) {
                int c = sentence.charAt(i);
                if(c >0x7F){
                    isASCII = false;
                    break;
            }
        }
            if(isASCII){
                String[] words = sentence.split(" ");
                String output ="";

                for (int i = words.length - 1; i >= 0; i--) {
                    output +=words[i]+" ";
                }
                System.out.print(output + "\b");
            }
            System.out.println();
        }else{
            System.out.println("Invlid sentence.");
            }
        }while(sentence.isBlank());
        
    }
    
}
