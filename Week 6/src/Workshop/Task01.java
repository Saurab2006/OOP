package Workshop;

import java.util.*;

public class Task01 {
    public static void main(String[] args) {
    	ArrayList<String> array;
        array = new ArrayList<>();
        array.add("BIC");
        array.add("Saurabh");
        array.add("Shubham");
        array.add("Aaryan");
        array.add("Anup");
        array.remove("Saurabh");
        System.out.println(array);
        for (String name : array) {
            System.out.println(name);
        }
    }
}