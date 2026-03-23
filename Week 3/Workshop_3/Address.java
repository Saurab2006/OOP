package Workshop_3;

class Address {
	private String street;
    private String city;
    private int zipCode;
    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public int getZipCode() {
        return zipCode;
    }
    
    public static void main(String[] args) {

        Address a1 = new Address();
        a1.setStreet("Rampur");
        a1.setCity("Biratnagar");
        a1.setZipCode(44600);
        System.out.println("Street: " + a1.getStreet());
        System.out.println("City: " + a1.getCity());
        System.out.println("Zip Code: " + a1.getZipCode());
    }
}
