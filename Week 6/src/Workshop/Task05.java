package Workshop;
	import java.util.*;

	public class Task05 {
		public static void main(String[] args) {
			
			Stack<String> t = new Stack<>();
			t.push("Read");
			t.push("Write");
			t.push("Code");
			t.pop();
			t.push("Debug");
			t.push("Test");
			System.out.println(t.peek());
			System.out.println(t);
	}
}