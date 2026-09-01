import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);

       System.out.println("enter a string");
       String s= sc.nextLine();
       int a[]= new int[s.length()];
       System.out.println("enter the array element");
       for(int i=0;i<s.length();i++){
           
           a[i]= sc.nextInt();
       }
       System.out.println("Output");
       for(int i=0;i<s.length();i++){
           System.out.println(s.charAt(i));
           System.out.println(a[i]);
       }
             
    }       

}
