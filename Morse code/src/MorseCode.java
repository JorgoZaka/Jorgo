/**
 *
 * @author Jorgo Zaka, Ervis Ciku
 */
import java.util.*;

public class MorseCode {
     public static void morseConverter(String[] code, String codeInput ){
      
       Scanner scan = new Scanner(System.in);
       codeInput = scan.next();
       codeInput += scan.nextLine();
        
        String[] array = codeInput.split(" ");
        System.out.print("Morse code " + codeInput + " to English is ");
        // Morse code to English
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < code.length; j++) {
                if (array[i].compareTo(code[j]) == 0) {
                    System.out.print((char)(j + 'a') + " ");
                    break;
                }
            }
        }
    }
    public static void englishConverter(String[] code, String englishLang, char[] wordInput){
        
       Scanner scan = new Scanner(System.in);
       englishLang = scan.next();
       englishLang += scan.nextLine();
       
       System.out.print("Morse code of " + englishLang + " is ");
        for (int i = 0; i < englishLang.length(); i++) {
            for (int j = 0; j < wordInput.length; j++) {
                if (englishLang.charAt(i) == wordInput[j]) {
                    System.out.print(code[j] + " ");
                    break;
                }
            }
        }
    }
 
    public static void main(String[] args)
    {
        
        System.out.println("Enter the morse code you want to convert and then the english word or sentence to convert to morse code");
        
        char[] letter = { 'a', 'b', 'c', 'd', 'e', 'f','g', 'h', 'i', 'j', 'k', 'l','m', 'n', 'o', 'p', 'q', 'r',
                          's', 't', 'u', 'v', 'w', 'x','y', 'z', '1', '2', '3', '4','5', '6', '7', '8', '9', '0' };
        
        String[] code = { ".-",   "-...", "-.-.", "-..",  ".", "..-.", "--.",  "....", "..",   ".---",
                "-.-",  ".-..", "--",   "-.",   "---",".--.", "--.-", ".-.",  "...",  "-",
                "..-",  "...-", ".--",  "-..-", "-.--","--..", ".----","..---","...--","....-",".....",
                "-....","--..." ,"---..","----.","-----"};
 
   
        
        String codeInput = " ";
        String wordInput = "";
       
        // morse to English
        morseConverter(code, codeInput);
       
        // English to morse code
        englishConverter(code, wordInput, letter);
    }
}
