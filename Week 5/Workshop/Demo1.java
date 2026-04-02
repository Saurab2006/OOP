package Workshop;

public class Demo1 {
	public static void main(String[] args) {
		try {
			int[] age = {10,20,25,24,28,27,30,31,32};
			System.out.println(age[9]);
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("Out of index");
		}
	}

}