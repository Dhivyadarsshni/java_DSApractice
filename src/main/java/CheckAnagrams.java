public class CheckAnagrams {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        System.out.println("\nThe Strings are "+ checkAnagrams(s1,s2)+" Anagrams");
    }
    static boolean checkAnagrams(String s1, String s2){
        if(s1.length()!= s2.length())
            return false;

        int [] freq = new int[26];  // entering about all alphabets in lowercase only

        s1= s1.toLowerCase(); s2= s2.toLowerCase();

        for(int i = 0 ; i < s1.length(); i++){
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }

        //displaying the array
        for(int num : freq){
            System.out.print(num +" ");
        }

        for(int count : freq){
            if (count!=0) return false;
        }

        return true;
    }
}
