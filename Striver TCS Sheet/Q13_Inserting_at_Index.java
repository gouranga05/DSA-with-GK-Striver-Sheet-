package practisee.JavaGeeks;

import java.util.Arrays;

public class Q13_Inserting_at_Index {
    public static void insertatpos(int element, int index, int[]arr){
//        int[] ans=new int[arr.length];
//        arr[arr.length-1]=arr[index];
//        for(int i=0;i<index;i++){
//            if(i<index){
////                ans[i]=arr[i];
//            }
//            else{
//                arr[i]=arr[i-1];
//            }
//        }
        for(int i=arr.length-1;i>index;i--){
            arr[i]=arr[i-1];
        }
//        for(int i=index+1;i<arr.length;i++){
//              arr[i]=arr[i-1];
//        }
//        ans[index]=element;
        arr[index]=element;
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,0};   //1,2,3,4,8,5,6,7
        insertatpos(8,4, arr);
    }
}
