package practisee.JavaGeeks;

import java.util.Arrays;

public class Q8_RotateArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int k=2;
        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=arr[(i+k)%(arr.length)];
        }
        int []ab=new int[arr.length];
//        System.out.println(Arrays.toString(ans));
        for(int i=0;i<arr.length;i++){
            ab[(i+k)%(arr.length)]=arr[i];
        }
        System.out.println(Arrays.toString(ab));
    }
}
