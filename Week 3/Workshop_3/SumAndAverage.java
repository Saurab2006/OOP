package Workshop_3;

public class SumAndAverage {

	public static void main(String[] args) {
		float[] num = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f};

        float sum = 0;

        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }

        float average = sum / num.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

	}

}
