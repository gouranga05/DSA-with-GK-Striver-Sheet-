package practisee.JavaGeeks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Q19_SortElementsbyFrequency {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,4,3,1,2};
        HashMap<Integer,Integer> map= new HashMap();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])) map.put(arr[i],1);
            else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        ArrayList<Integer> list= new ArrayList<>();
        for(Map.Entry<Integer,Integer> mp:map.entrySet()){
            list.add(mp.getValue());
        }
        Collections.sort(list);    //3,2,2,1
        ArrayList<Integer> list1=new ArrayList<>();
        System.out.println(list);
        for(int i=0;i<list.size();i++){
            list1.add(list.get(list.size()-1-i));
        }
//        System.out.println(list1);
        ArrayList<Integer> list2=new ArrayList<>();

            for(int i=0;i< list1.size();i++){
                for(Map.Entry<Integer,Integer> mp:map.entrySet()){
                if(list1.get(i)==mp.getValue()){
                    list2.add(mp.getKey());
                }
            }
        }
        System.out.println(list2);
    }
}
