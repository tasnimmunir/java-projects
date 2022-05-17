import java.util.Scanner;
public class Converter
{
   public static void main(String[] args)
   {
      int menuselection;
      double distance;
      Scanner input = new Scanner(System.in);
      do
      {
         System.out.print("Enter distance in meters: ");
         distance = input.nextDouble();
      }while(distance <= 0);
      do
      {
         System.out.println("1. Convert to kilometers");
         System.out.println("2. Convert to inches");
         System.out.println("3. Convert to feet");
         System.out.println("4. Quit the program");
         System.out.print("Enter your selection: ");
         menuselection = input.nextInt();
         switch (menuselection)
         {
            case 1 : showKilometers(distance);
               break;
            case 2 : showInches(distance);
               break;
            case 3 : showFeet(distance);
               break;
            case 4 : System.out.println("Bye!");
            break;
            default: System.out.println("Invalid selection. Re-enter choice");
         }
      } while (menuselection != 4);
   }
   public static void menu()
   {
      System.out.println("1. Convert to kilometers");
      System.out.println("2. Convert to inches");
      System.out.println("3. Convert to feet");
      System.out.println("4. Quit the program");
   }
   public static void showKilometers(double meters)
   {
      double kilometers = meters * 0.001;
      System.out.println(meters + " meters is " +
              kilometers + " kilometers.");
   }
   public static void showInches(double meters)
   {
      double inches = meters * 39.37;
      System.out.println(meters + " meters is " +
              inches + " inches.");
   }
   public static void showFeet(double meters)
   {
      double feet = meters * 3.281;
      System.out.println(meters + " meters is " +
              feet + " feet.");
   }
}