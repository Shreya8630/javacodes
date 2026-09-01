package Class_java;

import java.util.Scanner;

class test{

    public test(int a){
        if (a>=3 && a<=20){
            System.out.println("hi, i am constructor");
        }
        else{
            System.out.println("invalid");
        }
    }

    public static void call(){
        System.out.println("hi, i am outside of constructor");
    }
}

class Obvious{

    public static void call(){
        System.out.println("hi, i am inside of obvious");
    }
}

public class Construct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        test c=new test(sc.nextInt());
    }
}
