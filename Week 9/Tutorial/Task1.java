package Tutorial;
import java.util.*;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class Task1 {
	 public static void main(String[] args) throws IOException{
		 File f = new File("task.txt");
		 
		 try {
			 f.createNewFile();
		 }
		 catch (IOException e) {
			 e.printStackTrace();
			 
		 }
		 System.out.println(f.getName());
		 System.out.println(f.getAbsolutePath());
		 System.out.println(f.canRead());
		 System.out.println(f.canWrite());
		 f.delete();	
		 
		 Task 4:
		 Write a java program to write the text “Java is a high level programming language” into a file named “task3.txt” with the help of OutputStream class.
			 
		 FileOutputStream o = new FileOutputStream("Task3.txt");
		 String d = "Java is a high level Programming Language";
		 byte[] data = d.getBytes();
		 
		 o.write(data);
		 o.close();
		 
		 Task 5:
		 Write a java program to read the text from the file named “task3.txt” with the help of InputStream class.
		 FileInputStream in = new FileInputStream("Task3.txt");
		 int a;
		 while((a = in.read()) != -1) {
			 System.out.print((char)a);
			 in.close();
			 
			 Task 6:
		        Write text into a file using Writer class

		        FileWriter w = new FileWriter("task3.txt");

		        String text = "Java is a high level programming language";

		        w.write(text);
		        w.close(); // close writer

		        // Task 7:
		        // Read text from the file using Reader class

		        FileReader r = new FileReader("task3.txt");

		        int ch;
		        while ((ch = r.read()) != -1) {
		            System.out.print((char) ch);
		        }

		        r.close();
	        Task 8:
	        Write text into a file using BufferedWriter class
		 FileWriter f = new FileWriter("task3.txt");
		 BufferedWriter b = new BufferedWriter(f);
		 b.write("Java is a high level Programming Language");
		 b.close();

	        // Task 9:
	        // Read text from the file using BufferedReader class
		 	Reader r = new FileReader("task3.txt");
	        BufferedReader br = new BufferedReader(r);
	        
	        String line; 
	        while((line = br.readLine()) != null) {
	        	System.out.println(line);
	        }
	        br.close(); 
	        
	        Task 10:
	        Write a java program to copy the contents of “source.txt” to “destination.txt” using BufferedInputStream and BufferedOutputStream.
		 FileOutputStream O = new FileOutputStream("source.txt");
	        String d = "Java is a high level programming language";
	        O.write(d.getBytes());
	        O.close();
	        
	        BufferedInputStream in = new BufferedInputStream(new FileInputStream("source.txt"));
	        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("destination.txt"));

	        int ch;
	        while ((ch = in.read()) != -1) {
	            out.write(ch);
	        }

	        in.close();
	        out.close();

	        System.out.println("File copied successfully");
		 
		 Task 11:
		 Write a program to rename the file.
	        File oldFile = new File("source.txt");
	        File newFile = new File("renamed.txt");

	        if (oldFile.renameTo(newFile)) {
	            System.out.println("File renamed successfully");
	        } else {
	            System.out.println("File renaming failed");
	        }
	 }
}