import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args){

        Stack stack = new StackLinkedList();
        try {
            stack.pop();
        }catch (Exception e){
            System.out.println(e);
        }
/*
        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("123");
        HashMap<String, Double> grades = new HashMap<>();
        grades.put("Mustafa", 100.0);
        System.out.println(grades);
        grades.put("Pelin", 0.0);
        System.out.println(grades);
        grades.put("Emre", 99.0);
        System.out.println(grades);
        grades.put("Pelin", 30.0);
        System.out.println(grades);
        grades.put("yasin", 100.0);
        System.out.println(grades);
        System.out.println(grades.keySet() instanceof Set);
*/

    }
}