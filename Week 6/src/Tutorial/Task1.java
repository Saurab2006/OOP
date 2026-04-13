package Tutorial;
import java.util.*;
import java.util.Collections;
import java.util.Iterator;
public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>obj = new ArrayList<>();
		obj.add("BIC");
		obj.add("Saurabh");
		obj.add("Shubham");
		obj.add("Aaryan");
		obj.remove("Saurabh");
		System.out.println(obj);
		
		Iterator<String> a = obj.iterator();
		while(a.hasNext()) {
			System.out.println(a.next());
		}
		Collections.reverse(obj);
		System.out.println(obj);

	}

}
