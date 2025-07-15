public class ConstantWindowInTwoPointer {
    public static void main(String[] args) {
        int [] arr = {-1, 2 , 3,7,5,-1,-2,8};
        int k = 4;

        int result = maxKElementSum(arr,k);

        System.out.println(result);
    }
    public static int maxKElementSum(int[] arr,int k){
        int sum = 0; int maxSum =0;
        int l = 0 ; int r = k-1;

       for(int i = l ; i <= r; i++){
            sum+=arr[i];
        }

       while( r < arr.length-1){
           sum -= arr[l];
           l++;

           r++;
           sum+=arr[r];

           maxSum = Math.max(sum,maxSum);

       }
       return maxSum;
    }
}
