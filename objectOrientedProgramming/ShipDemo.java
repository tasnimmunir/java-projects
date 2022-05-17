import java.util.ArrayList;
import java.util.Iterator;

public class ShipDemo
{
   public static void main(String[] args) {
       Ship ships[] = new Ship[2];
       ships[0] = new CruiseShip("Titanic", "1970", 1500);
       ships[1] = new CargoShip("Valiant", "1993", 500);

       for (int i = 0; i < ships.length; i++) {
           ships[i].display();
       }
       ArrayList<Ship> shiptypes = new ArrayList<Ship>();
       shiptypes.add(new CruiseShip("The Mayflower", "1970", 2000));
       shiptypes.add(new CruiseShip("HMS Victory", "1970", 1000));
       shiptypes.add(new CargoShip("Sealinks", "1991", 300));
       shiptypes.add(new CargoShip("SeaRoad", "1992", 400));

       for (int i = 0; i < shiptypes.size(); i++) {
           System.out.println(shiptypes.get(i).toString());
       }
       //copy constructors testing
       CruiseShip mycruiseship = new CruiseShip("Battleship", "2002", 1000);
       CargoShip mycargoship = new CargoShip("HMS", "2003", 600);
       CruiseShip copycruiseship = new CruiseShip(mycruiseship);
       CargoShip copycargoship = new CargoShip(mycargoship);
       if (mycruiseship.equals(copycruiseship)) {
           System.out.println("mycruiseship equals to cruiseship");
       }
       if (mycargoship.equals(copycargoship)) {
           System.out.println("mycargoship equals to cargoship");

       }
   }
}