public class FahrenheitToCelsius{

    public static void main(String[] args) {
        for(int f = 0; f <= 20; f++)
        {
            System.out.println("Fahrenheit : " +f);
            System.out.println("Celsius : "+ celsius(f));
        }
    }
    public static double celsius(double f)
    {
      double c = (5.0/9.0)*(f-32);
      return c;
    }

}
