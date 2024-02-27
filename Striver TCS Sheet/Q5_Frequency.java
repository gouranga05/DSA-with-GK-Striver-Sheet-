package practisee.JavaGeeks;
import java.util.*;

public class Q5_Frequency {
    public static void main(String[] args) {
       int arr[] = {10,5,10,15,10,5};
       HashMap<Integer, Integer> map= new HashMap<>();
       for(int i=0;i<arr.length;i++){
           if(!map.containsKey(arr[i])) map.put(arr[i],1);
           else{
               map.put(arr[i],map.get(arr[i])+1);
           }
       }
       for(Map.Entry<Integer,Integer> mp: map.entrySet()){
           int k=Integer.MIN_VALUE;
           int m=0;
           if(k<mp.getValue()) {
               k = mp.getValue();
               m=mp.getKey();
           }
           int s=0;
           s=Math.max(s,mp.getKey());
//           System.out.println(mp.getKey() + " " + mp.getValue());
           System.out.println(m + "    "+k);
           System.out.println(s);
       }
    }
}
