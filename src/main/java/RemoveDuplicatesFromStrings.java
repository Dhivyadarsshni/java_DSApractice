public class RemoveDuplicatesFromStrings {
    public static void main(String[] args) {
        String s ="Programming110@!@";

        System.out.println(s);

        String result  = removeDuplicates(s);

        System.out.println("After removing dupes: " +result);
    }
    public static String removeDuplicates(String s){

        StringBuilder sb = new StringBuilder();

        boolean[] visited = new boolean[128]; //standard size of ASCII for symbols and all cases of letters
        //initially false {false,false,false,false,.......}

        for(int i = 0 ; i < s.length() ; i++){

            if(!visited[s.charAt(i)]){
                //checks if the char is in the visited array or not , if false
                visited[s.charAt(i)] = true; //change as true
                //if true, append in sb
                sb.append(s.charAt(i));
            }

        }
        return sb.toString();
    }
}
