package recursion.strings;

import java.util.ArrayList;

public class Dice {

    public static void main(String args[]){
        dice("",2);
        System.out.println(diceReturn("", 3));
    }

    private static void dice(String p, int target) {
        if (target==0){
            System.out.println(p);
            return;
        }
        for (int i=1; i<=target; i++){
            dice(p+i, target-i);
        }
    }

    private static ArrayList<String> diceReturn(String p, int target) {
        if (target==0){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> result = new ArrayList<>();
        for (int i=1; i<=target; i++){
            //ArrayList<String> re = diceReturn(p+i, target-i);
            result.addAll(diceReturn(p+i, target-i));
        }
        return result;
    }

}
