package practisee.JavaGeeks;

import java.util.Arrays;

public class Q3_SecondSmallestlargest {
    public static void main(String[] args) {
        int[] arr={2,4,3,7,5,9};
        // ans[]= {9,5,7,3,4,2}
        Arrays.sort(arr);
        System.out.println("2nd smallest is" +arr[1] + " 2nd largest is " +arr[arr.length-2]);
        int[] ans= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=arr[arr.length-i-1];
        }
        int a=0, b=arr.length-1;
        for(int i=0;i<arr.length;i++){

        }

        System.out.println(Arrays.toString(ans));
    }
}
