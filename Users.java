//07/09/2026
public class Users {

    int id;
    String name;
    String address;
    public Users(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public String toString() {
        return "Student={Id: " + id + ", Name: " + name + ", Address: " + address + "}";
    }
}
