package Tutorial;
import java.util.*;
public class Task12{
    public static void main(String[] args) {
        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();

        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);

        setB.add(1);
        setB.add(2);
        setB.add(3);
        boolean isSubset = setA.containsAll(setB);
        System.out.println("Set A: " + setA);
        System.out.println("Set B: " + setB);
        System.out.println("Is setB a subset of setA? " + isSubset);
    }
}