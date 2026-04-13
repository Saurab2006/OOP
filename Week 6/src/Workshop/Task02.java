package Workshop;
import java.util.*;

public class Task02 {
    public static void main(String[] args) {
        
        LinkedList<String> obj = new LinkedList<>();
        obj.addFirst("A");
        obj.addFirst("B");
        obj.addLast("C");
        obj.addLast("D");
        System.out.println(obj);
        System.out.println(obj.isEmpty());
    }
}