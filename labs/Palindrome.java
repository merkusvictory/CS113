/// Marcus Hilario
public class Palindrome {
    public static void main (String[] args) {
        System.out.println(palindrome("ratcar"));
    }
    public static boolean palindrome(String word) {
        if(word.length() < 2) {
            return true;
        }
        else {
            if(word.charAt(word.length()-1) == word.charAt(0)) 
                return palindrome(word.substring(1, word.length()-1));
            else
                return false;
        }
    }
}
