package practisee.JavaGeeks;
import java.util.*;
public class Q15_NonrepeatingElements {
    public static void main(String[] args) {
        int[] arr={1,2,-1,1,3,1};
        HashSet<Integer> set= new HashSet<>();
        HashSet<Integer> set2= new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
                set2.add(arr[i]);
            }
            else{
                set2.remove(arr[i]);
            }
        }
        System.out.println(set2);
    }
}
