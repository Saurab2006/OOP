package Workshop;

import java.io.*;

public class Qn7 {

    public static void main(String[] args) {

        try {

            BufferedReader br = new BufferedReader(new FileReader("student.csv"));

            String headerLine = br.readLine();
            String[] headers = headerLine.split(",");

            BufferedWriter[] writers = new BufferedWriter[headers.length];

            for (int i = 0; i < headers.length; i++) {
                writers[i] = new BufferedWriter(new FileWriter(headers[i].trim() + ".txt"));
            }

            String line;

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");

                for (int i = 0; i < values.length; i++) {
                    writers[i].write(values[i].trim());
                    writers[i].newLine();
                }
            }

            br.close();

            for (BufferedWriter bw : writers) {
                bw.close();
            }

            System.out.println("CSV successfully converted into separate text files.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}