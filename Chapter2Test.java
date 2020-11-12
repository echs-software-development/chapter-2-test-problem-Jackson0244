import java.util.Scanner;

public class Chapter2Test {
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   
  System.out.print("Input first number: ");
  int num1 = in.nextInt();
   
  System.out.print("Input second number: ");
  int num2 = in.nextInt();
   System.out.println("Average of the numbers is: " + 
   (num1 + num2) / 2);
 }
}