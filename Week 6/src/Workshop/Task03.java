package Workshop;
import java.util.*;
public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> obj = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		int s = 2;
		Collections.rotate(obj, s);
		System.out.println(obj);

	}

}
