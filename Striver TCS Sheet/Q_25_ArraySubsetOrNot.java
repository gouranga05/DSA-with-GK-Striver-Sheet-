package practisee.JavaGeeks;

import java.util.HashSet;

public class Q_25_ArraySubsetOrNot {
    public static void main(String[] args) {
        int []arr1={1,3,4,5,2,2,5,8,7,9,9,10};
        int[] arr2={2,4,3,1,7,5,15};
        HashSet<Integer> hash= new HashSet<>();
        for(int i:arr1) hash.add(i);
        for(int i:arr2) if(hash.contains(i)) hash.remove(i);
        System.out.println(hash.size()==0);
    }
}
