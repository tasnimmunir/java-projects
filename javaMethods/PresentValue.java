import java.util.Scanner;
public class PresentValue {
   public static void main(String[] args) {
      double F; // value for future
      double r; //annual interest rate
      int n;// number of years
      Scanner input = new Scanner(System.in);
      System.out.println("Enter your desired Future Value: ");
      F = input.nextDouble();
      System.out.println("Enter Annual Interest Rate: ");
      r = input.nextDouble();
      System.out.println("Enter Number of Years: ");
      n = input.nextInt();
      PresentValue.presentValue(F, r, n);
      }
      public static void presentValue(double F,double r, int n)
      {
         double P = (F/Math.pow(1+r, n));
         System.out.println("Present Value is: " + P);
      }
   }