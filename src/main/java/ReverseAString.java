public class ReverseAString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcdefgh");
        reverseString(sb);
        System.out.println("Reversed: "+sb);
    }
    static void reverseString(StringBuilder s){
        int left = 0 ; int right = s.length()-1;

        while (left<right){
            char leftElement = s.charAt(left);
            char rightElement = s.charAt(right);

            s.setCharAt(left,rightElement);
            s.setCharAt(right,leftElement);

            left++;
            right--;
        }
    }
}
