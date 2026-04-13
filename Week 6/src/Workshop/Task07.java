package Workshop;
import java.util.*;
public class Task07 {

	    public static void main(String[] args) {
	        Deque<String> q = new ArrayDeque<>();
	        q.addLast("Document1");
	        q.addLast("Document2");
	        q.addLast("Document3");
	        System.out.println("First: " + q.removeFirst());

	        q.addLast("Document4");
	        q.addLast("Document5");
	        System.out.println("Last: " + q.peekFirst());
	        System.out.println("Current:");
	        for (String job : q) {
	            System.out.println(job);
	        }
	    }
}