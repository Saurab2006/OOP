package Workshop;
import java.io.*;
import java.util.*;

public class Qn6 {
    public static void main(String[] args) {
        try {
            BufferedWriter bw1 = new BufferedWriter(new FileWriter("product.txt"));

            bw1.write("product;price");
            bw1.newLine();
            bw1.write("Laptop;40000");
            bw1.newLine();
            bw1.write("SmartPhone;50000");
            bw1.newLine();
            bw1.write("SmartPhone;60000");
            bw1.newLine();
            bw1.write("Laptop;80000");

            bw1.close();

            BufferedReader br = new BufferedReader(new FileReader("product.txt"));

            Map<String, Double> total = new HashMap<>();
            Map<String, Integer> count = new HashMap<>();

            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] arr = line.split(";");

                String product = arr[0];
                double price = Double.parseDouble(arr[1].trim());

                total.put(product, total.getOrDefault(product, 0.0) + price);
                count.put(product, count.getOrDefault(product, 0) + 1);
            }

            br.close();

            BufferedWriter bw = new BufferedWriter(new FileWriter("average.csv"));
            bw.write("Product,Average Price");
            bw.newLine();

            for (String p : total.keySet()) {
                double avg = total.get(p) / count.get(p);
                bw.write(p + "," + avg);
                bw.newLine();
            }

            bw.close();

            System.out.println("Export to CSV.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}