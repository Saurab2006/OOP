package Workshop;

import java.io.*;

public class Qn2 {
    public static void main(String[] args) {
        try {
            BufferedReader r = new BufferedReader(new FileReader("student.csv"));
            BufferedWriter w = new BufferedWriter(new FileWriter("student_copy.txt"));

            String line;

            while ((line = r.readLine()) != null) {
                w.write(line);
                w.newLine();
            }

            r.close();
            w.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}