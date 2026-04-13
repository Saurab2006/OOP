package Workshop;
import java.util.*;
public class Task013 {
	    	public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<>();
	        Collections.addAll(colors, "Red","Blue","Green","Yellow","Orange");

	        Collections.sort(colors); 
	        System.out.println("Asc: " + colors);

	        Collections.sort(colors, Collections.reverseOrder()); 
	        System.out.println("Desc: " + colors);
	}

}
