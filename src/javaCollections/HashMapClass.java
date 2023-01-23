package javaCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapClass {
    public static void main(String args[]){

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        //Simple print
        System.out.println(map);


        //Iterator in Hashmap
        for (Map.Entry<Integer, String> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //print only key
        Set<Integer> keys = map.keySet();
        for (Integer key : keys){
            System.out.println(key + " "+ map.get(key));
        }

    }
}
