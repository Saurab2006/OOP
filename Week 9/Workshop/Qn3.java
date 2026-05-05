package Workshop;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Num {

    public List<Integer> read(String filepath) throws IOException {
        List<Integer> numbers = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(filepath));

        String line = br.readLine();
        String[] data = line.split(" ");

        for (String num : data) {
            numbers.add(Integer.parseInt(num));
        }

        br.close();
        return numbers;
    }

    public List<Integer> getEven(List<Integer> numbers) {
        List<Integer> even = new ArrayList<>();

        for (int n : numbers) {
            if (n % 2 == 0) {
                even.add(n);
            }
        }

        return even;
    }

    public List<Integer> getOdd(List<Integer> numbers) {
        List<Integer> odd = new ArrayList<>();

        for (int n : numbers) {
            if (n % 2 != 0) {
                odd.add(n);
            }
        }

        return odd;
    }

    public void write(List<Integer> numbers, List<Integer> even, List<Integer> odd, String filePath) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));

        bw.write(numbers.toString());
        bw.newLine();

        for (int n : even) {
            bw.write(n + " ");
        }
        bw.newLine();

        for (int n : odd) {
            bw.write(n + " ");
        }
        bw.newLine();

        bw.close();
    }
}

public class Qn3 {

    public static void main(String[] args) {

        try {
            Num n = new Num();

            List<Integer> numbers = n.read("destination.txt");

            List<Integer> even = n.getEven(numbers);
            List<Integer> odd = n.getOdd(numbers);

            System.out.println(numbers);
            System.out.println(even);
            System.out.println(odd);

            n.write(numbers, even, odd, "result.txt");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}