package practice;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {
    public static void main(String args[]){

        Employee e1 = new Employee(1000, "a","fin");
        Employee e2 = new Employee(3000, "b","ad");
        Employee e3 = new Employee(4000, "c","sale");

        HashMap<Integer, Employee> map = new HashMap();

        map.put(1, e1);
        map.put(2, e2);
        map.put(3, e3);

        ArrayList<Employee> list = testFun(map);
        for (int i = 0; i< list.size();i++){
            System.out.println(list.get(i).toString());
        }
    }

    private static ArrayList<Employee> testFun(HashMap<Integer, Employee> map) {

        ArrayList<Employee> list = new ArrayList<>();
        int i=1;
        while (i<=3){
            Employee e = map.get(i);
            if (e.getSalary()>1500){
                list.add(e);
            }
            i++;
        }
        return list;
    }
}
