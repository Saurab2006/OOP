package Workshop;
import java.io.*;

public class Qn1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream create = new FileOutputStream("one.txt");
        create.write("Java is a high level Programming Language".getBytes());
        create.close();

        BufferedInputStream in = new BufferedInputStream(new FileInputStream("one.txt"));

        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("two.txt"));

        int ch;

        while ((ch = in.read()) != -1) {
            out.write(ch);
        }

        in.close();
        out.close();
 
    }
}