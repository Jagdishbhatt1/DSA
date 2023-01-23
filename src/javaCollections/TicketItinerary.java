package javaCollections;

import java.util.HashMap;

public class TicketItinerary {
    public static void main(String args[]) {
        HashMap<String, String> map =new HashMap<>();
        map.put("chen", "bang");
        map.put("mum", "del");
        map.put("goa", "chen");
        map.put("del", "goa");

        HashMap<String, String> reMap= new HashMap<>();
        for (String key : map.keySet()){
            reMap.put(map.get(key), key);
        }

        String start = startPath(map, reMap);
        printPath(start, map);

    }

    private static void printPath(String start, HashMap<String, String> map) {
        if(start==null){
            return;
        }

        while(map.containsKey(start)){
            System.out.print(start+"-->");
            start = map.get(start);
        }
        System.out.print(start);

    }

    private static String startPath(HashMap<String, String> map, HashMap<String, String> reMap) {
        for(String key : map.keySet()){
            if(!reMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }

}
