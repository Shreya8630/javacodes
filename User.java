class Store{

    int id;
    String name;
    String address;
    public Store(int id ,String name,String address){
        this.id = id;
        this.name = name;
        this.address = address;

    } 
    public String Student(){
        return "Student={Id: " + id + ", Name: " + name + ", Address: " + address + "}";
    }
}

public class User {
    public static void main(String[] args) {
       Store s1 = new Store(1, "Shreya", "456 Blue St");
       Store s2 = new Store(2, "Riya", "789 Green St");
       Store s3 = new Store(3, "Ananya", "123 Red St");
       System.out.println(s1.Student());
       System.out.println(s2.Student());
       System.out.println(s3.Student());
    }
}