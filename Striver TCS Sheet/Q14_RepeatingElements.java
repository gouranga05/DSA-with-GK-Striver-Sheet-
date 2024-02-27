package practisee.JavaGeeks;
import java.util.*;
public class Q14_RepeatingElements {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,1,4,5,2};
        ArrayList<Integer> list1= new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(!list1.contains(arr[i])){
                list1.add(arr[i]);
            }
            else{
                list2.add(arr[i]);
            }
        }

        System.out.println(list2);

        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])) map.put(arr[i],1);
            else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> mp:map.entrySet()){
            if(mp.getValue()>1){
                list.add(mp.getKey());
//                System.out.println(list);
//                System.out.println(list.toArray());
//                System.out.print(mp.getKey() + " ");
            }
        }
    }
}
