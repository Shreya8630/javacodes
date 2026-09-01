import java.util.Scanner;

abstract class test1 {

    abstract void print();
}   

abstract class test2 {

    abstract void define ();
}

class b extends test1 {

    int ch;
    void print() {
        System.out.println("Choose one of the following options: ");
        System.out.println("1. car");
        System.out.println("2. bike");
        System.out.println("3. cycle");
    }

    void define() {
        switch (ch) {
            case 1:
                System.out.println("You have selected car");
                System.out.println("Features: Fast, Comfortable");
                break;
            case 2:
                System.out.println("You have selected bike");
                System.out.println("Features: Affordable, Fuel-efficient");
                break;
            case 3:
                System.out.println("You have selected cycle");
                System.out.println("Features: Low cost, Environmentally friendly");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}

public class Abs {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        b obj = new b();
        obj.print();
        System.out.print("Enter your choice: ");
        obj.ch = sc.nextInt();
        obj.define();
    }
}
    
   
