import java.util.Scanner;

public class Algo_7 {
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
                    String longestWord ="";
                    String shortesttWord ="";
    
                    for (int i = 1; i <= words.length; i++) {
                        if(words[1].length()>=longestWord.length()){
                            longestWord = words[i];
                        }
                    }
                    System.out.println("Longest word = "+longestWord);

                    // for (int i = 1; i <= words.length; i++) {
                    //     if(words[1].length() <=shortesttWord.length()){
                    //         shortesttWord = words[i];
                    //     }
                    // }
                    // System.out.println("Longest word = "+shortesttWord);
                }
                System.out.println();
            }else{
                System.out.println("Invlid sentence.");
                }
            }while(sentence.isBlank());
            
    }
    
}
