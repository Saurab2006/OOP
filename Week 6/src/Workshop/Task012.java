package Workshop;
import java.util.*;
public class Task012 {

	public static void main(String[] args) {
       Integer[] arr = {5, 2, 8, 1, 9, 3};
	   Arrays.sort(arr); 
	   System.out.println("Asc: " + Arrays.toString(arr));
	   Arrays.sort(arr, Collections.reverseOrder()); 
	   System.out.println("Desc: " + Arrays.toString(arr));
	}

}
