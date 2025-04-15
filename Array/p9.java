import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p9 {
    public static String reverseWords(String s) {
        String[] wordd =  s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : wordd) {
            String reversedWord = new StringBuilder(word).reverse().toString();
 
            result.append(reversedWord).append(" ");
        }
        
        return result.toString().trim();
    }

    public static void main(String[] args) {
      String s = "the sky is blue";
     
      String words = reverseWords(s);
      System.out.println(words);
  
    }
}
