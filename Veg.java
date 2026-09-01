import java.util.Scanner;

public class Veg{
    public static void main(String[] args) {
        int total=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the name of the vegetable: ");
        String vegName[] = new String[total];
        vegName[0] = sc.nextLine();
        System.out.println("Enter the price of the vegetable: ");
        float vegPrice[] = new float[totall];
        vegPrice[0] = sc.nextFloat();
        System.out.println("Enter the quantity of the vegetable: ");
        float vegQuantity[] = new float[total];
        vegQuantity[0] = sc.nextFloat();
       

        for(int i=0; i<1; i++){
            System.out.println("Vegetable at position " + (i + 1) + "position");
            System.out.println(vegName[i] + " " + vegPrice[i] + " " + vegQuantity[i]);
        }

}