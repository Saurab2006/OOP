package Workshop;
import java.util.*;
public class Task06 {
public static void main(String[] args) {		
		String sentence = "Hello World";
		String[] words = sentence.split(" ");

		Stack<String> s = new Stack<>();
		for(int i = 0; i < words.length; i++) {
			s.push(words[i]);
		}
		while (!s.isEmpty()) {
			System.out.print(s.pop() + " ");
		}
	}

}
