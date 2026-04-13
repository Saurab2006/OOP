package Workshop;
import java.util.*;
public class Task08 {
	public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.add("S");
        names.add("A");
        names.add("A");
        names.add("P");
        for (String name : names) {
            System.out.println(name);
        }
    }
}