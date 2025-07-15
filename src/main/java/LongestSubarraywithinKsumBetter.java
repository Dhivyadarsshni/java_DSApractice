//Two Pointer from one starting point

import java.util.Arrays;

//expand - r++
//shrink - l++
public class LongestSubarraywithinKsumBetter {
    public static void main(String[] args) {
        int [] arr = {2,-5,-1,10,10};
        int k = 10;
        int[] result = subarrayOfK(arr, k);

        System.out.println("the maximum length is :"+ Arrays.toString(result) );
    }

    public static int[] subarrayOfK(int[] arr , int k){
        int l = 0 ; int r = 0;
        int sum = 0 ; int maxLen = 0;
        int startIndex = 0;
        while (r < arr.length){
            sum += arr[r];

            while(sum > k){
                sum -= arr[l];
                l++;
            }

            //if(sum < = k)
            //maxLen = Math.max(maxLen,r - l +1);

            if(sum<=k && (r - l + 1) > maxLen) {
                maxLen = r - l + 1;
                startIndex = l;

                //trial run code starts
                System.out.println("check numbers");
                for(int i = l ; i <= r; i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
                //trial run code ended
            }
            r++;
        }
        return Arrays.copyOfRange(arr, startIndex, startIndex + maxLen);
    }
}
