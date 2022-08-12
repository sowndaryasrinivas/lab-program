//income tax calculation


import java.util.Scanner;
class Inc
{
public static void main(String[]args)
 {
 
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter your Annual income:");
 int income=sc.nextInt();
 
 if(income<=200000)
 {
 System.out.println("pay 2% of tax");
 }
 else if(income<=400000)
 {
 System.out.println("pay 4% of tax");
 }
 else if(income<=500000)
 {
  System.out.println("pay 10% of tax");
  }
  else
  {
  System.out.println("pay 40% of tax");
  }
  }
 }
