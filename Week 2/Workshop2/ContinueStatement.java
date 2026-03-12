package Workshop2;

public class ContinueStatement {

	public static void main(String[] args) {
		int x = 10;
		while(x < 20) {
			if(x == 15) {
				x++;
				continue;
			}
			System.out.println(x);
			x++;

		}

	}
}