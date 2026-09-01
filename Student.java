package Class_java;

import java.util.Scanner;

class Test{

    public String name(){

     String student;
     student="Shreya";
     return student;    
    }

    public float fees(){
        float fee= 20000.02f;
        return fee;
    }
}

class Test2{
     
    public int roll(){
      int rollNum;
      rollNum =18;
      return 18;
    }

    public char ch(){
        char init='c';
        return init;
    }

}

public class Student{

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number from 1 to 10");
        int num = sc.nextInt();

        Test n= new Test();
        Test2 a=new Test2();

        if (num<=10 && num>=1){
            System.out.println(n.name());
            System.out.println(a.roll());
        }
        else {
            System.out.println(n.fees());
            System.out.println(a.ch());
        }
        
        
    }
}