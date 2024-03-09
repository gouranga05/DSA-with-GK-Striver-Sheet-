package practisee.JavaGeeks;

import java.util.Arrays;

public class Q16_FindRank {
    public static void main(String[] args) {
        int[] arr={20,15,26,2,98,6};
        int[]copy=new int[arr.length];
        for(int i=0;i< arr.length;i++){
            copy[i]=arr[i];
        }
        Arrays.sort(copy); //2,6,15,20,26,98
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(copy));
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==copy[j]){
                    System.out.print((j+1) + " ");
                }
            }
        }
    }
}
