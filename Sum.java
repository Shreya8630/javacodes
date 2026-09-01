package Class_java;

import java.util.Scanner;

class Test{

    public int SumOfDigit(int num){

    int sum=0;
    int num1=num;
    while(num>0){ 

      int rem=num % 10;
      sum=sum*10+rem;
      num=num/10;
      
      if (rem==0){
        System.out.println("invalid");
        return sum;
      }
    }
     if (num1==sum){
        System.out.println("Reverse:"+sum);
        System.out.println("num is a pallidrom");
      }
      else{
        System.out.println("num is not a pallidrom");
      }
      
      return sum;
    }
  }
 

public class Sum{
    public static void main(String[] args){

        Test obj = new Test();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        obj.SumOfDigit(sc.nextInt());

    }

}