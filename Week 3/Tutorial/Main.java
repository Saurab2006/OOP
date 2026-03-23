package Tutorial;

class Mainclass123 {
		private String name;
		private int id;
		private int age;
		
		//getter method
		public String getname() {
			return name;
		}
		
		public int getid() {
			return id;
		}
		
		public int getage() {
			return age;
		}
		
		// Setter methods
	    public void setname(String name) {
	        this.name = name;
	    }

	    public void setid(int id) {
	        this.id = id;
	    }

	    public void setage(int age) {
	        this.age = age;
	    }
}


public class Main {
	public static void main(String[] args) {
	
        Mainclass123 s = new Mainclass123();

        s.setname("Saurabh");
        s.setid(101);
        s.setage(19);

        System.out.println("Name: " + s.getname());
        System.out.println("ID: " + s.getid());
        System.out.println("Age: " + s.getage());
    }
		
}