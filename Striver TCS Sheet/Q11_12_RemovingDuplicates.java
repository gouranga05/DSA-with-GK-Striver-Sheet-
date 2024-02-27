package practisee.JavaGeeks;

import java.util.HashSet;
import java.util.*;

public class Q11_12_RemovingDuplicates {
    public static void main(String[] args) {
        int[] arr={4,5,5,7,8,8,9,10,10,15};
        ArrayList<Integer> list= new ArrayList<>();
//        HashSet<Integer> hash= new HashSet<>();
        for(int i=0;i<arr.length;i++){
//            hash.add(arr[i]);
            if(!list.contains(arr[i])) list.add(arr[i]);
        }
//        for(int i:hash) System.out.print(i + " ");

        System.out.println(list);

//        Iterator<Integer> it = hash.iterator();
//        while(it.hasNext()){
//            System.out.print(it.next()+" ");
//        }

    }
}
