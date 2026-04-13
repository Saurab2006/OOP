package Tutorial;
import java.util.TreeSet;

public class Task11{
    public static void main(String[] args) {

        TreeSet<String> setA = new TreeSet<>();
        TreeSet<String> setB = new TreeSet<>();

        setA.add("R");
        setA.add("G");
        setA.add("B");

        setB.add("G");
        setB.add("Y");
        setB.add("B");

        TreeSet<String> union = new TreeSet<>(setA);
        union.addAll(setB);

        TreeSet<String> intersection = new TreeSet<>(setA);
        intersection.retainAll(setB);

        TreeSet<String> difference = new TreeSet<>(setA);
        difference.removeAll(setB);

        System.out.println("Set A: " + setA);
        System.out.println("Set B: " + setB);
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
        System.out.println("Difference: " + difference);
    }
}