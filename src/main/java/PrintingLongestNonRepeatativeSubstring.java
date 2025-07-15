import java.util.HashSet;

public class PrintingLongestNonRepeatativeSubstring {
    public static void main(String[] args) {
        String s = "abcdabccbca";
        System.out.println(s);
        String longestString = longSubstring(s);
        System.out.println("longest substring is "+longestString);
    }
    public static String longSubstring(String s){

        int left = 0; int right = 0;
        int maxLength = 0;
        int start = 0;

        HashSet<Character> substring = new HashSet();

        while (right<s.length()){
            char ch = s.charAt(right);

            while(substring.contains(ch)){
                substring.remove(s.charAt(left));
                left++;
            }

            substring.add(ch);

            if(right-left+1 > maxLength){
                maxLength = right - left + 1;
                start = left;
            }

            right++;
        }
    return s.substring(start,start+maxLength);

    }
}
