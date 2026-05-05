package Workshop;
import java.io.*;

public class Qn4 {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("Qn4.txt"));
            bw.write("Java is a high level programming language");
            bw.close();

            BufferedReader br = new BufferedReader(new FileReader("Qn4.txt"));

            int count = 0;
            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.split(" ");
                count += words.length;
            }

            br.close();

            System.out.println("Total words = " + count);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}