package Tutorial;
import java.util.ArrayList;

public class Task3 {

    public static void main(String[] args) {

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("R");
        arrayList1.add("B");
        arrayList1.add("G");

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Y");
        arrayList2.add("B");
        arrayList2.add("W");

        System.out.println("ArrayList1: " + arrayList1);
        System.out.println("ArrayList2: " + arrayList2);
        
        arrayList1.addAll(arrayList2);

        System.out.println("Joined :");
        System.out.println(arrayList1);
    }
}