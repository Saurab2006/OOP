package Tutorial;

import java.util.LinkedList;
import java.util.*;

public class Task7{
    public static void main(String[] args) {

        
        Queue<String> q = new LinkedList<>();

        
        q.add("A");
        q.add("B");
        q.add("C");
        
        q.remove("A");
  
        q.add("D");
        q.add("E");
        System.out.println( q.peek());
        System.out.println("Finalise Queue: " + q);
    }
}