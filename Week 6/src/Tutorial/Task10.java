package Tutorial;
import java.util.TreeSet;

	public class Task10 {
	    public static void main(String[] args) {  
	        TreeSet<Integer> n = new TreeSet<>();
	        n.add(1);
	        n.add(5);
	        n.add(3);
	        n.add(2);
	        n.add(4);
	        System.out.println(n.descendingSet());
	    }
	}