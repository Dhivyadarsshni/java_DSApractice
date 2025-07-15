import java.util.Locale;

public class PalindromeWithString {
    public static void main(String[] args) {
        String var = "abccba";
        System.out.println(isPalindrome(var));
    }
    private static boolean isPalindrome(String input){
//        String str = input.toLowerCase();
//
//        for(int i = 0; i < str.length()/2 ;i++){
//            char start = str.charAt(i);
//            char end = str.charAt(str.length() -1 -i);
//
//            if(start!=end) return false;
//
//        }
//        return true;

        String s = input.toLowerCase();
        int left = 0;
        int right = s.length()-1;

        while (left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
