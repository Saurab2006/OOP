package Workshop;
import java.util.*;

public class Task04 {
	public static void main(String[] args) {
		
		LinkedList<String> colors = new LinkedList<>(List.of("Red", "Green", "Blue", "Yellow", "Orange"));

		for(String color : colors) {
			System.out.println(color);
		}
		System.out.println(colors.contains("Red"));
		
		Collections.shuffle(colors);
		System.out.println(colors);
		
		Collections.sort(colors);
		System.out.println(colors);
	}
}