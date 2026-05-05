package Workshop;
import java.io.*;
import java.util.*;

public class Qn5 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            BufferedWriter b = new BufferedWriter(new FileWriter("student.csv"));

            b.write("firstName,lastName,address,contactNumber,semester");
            b.newLine();

            System.out.print("First Name: ");
            String firstName = sc.nextLine();

            System.out.print("Last Name: ");
            String lastName = sc.nextLine();

            System.out.print("Address: ");
            String address = sc.nextLine();

            System.out.print("Contact Number: ");
            String contact = sc.nextLine();

            System.out.print("Semester: ");
            String semester = sc.nextLine();

            b.write(firstName + "," + lastName + "," + address + "," + contact + "," + semester);

            b.close();
            sc.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}