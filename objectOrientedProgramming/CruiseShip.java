public class CruiseShip extends Ship {
   private int passengers;

   public CruiseShip(String name, String yearBuilt, int passengers) {
      super(name, yearBuilt);
      this.passengers = passengers;
   }
   public CruiseShip(CruiseShip object2) {
      passengers = object2.passengers;
      this.setName(object2.getName());
      this.setYearBuilt(object2.getYearBuilt());
   }
   public void setPassengers(int passengers){
      this.passengers  = passengers ;
   }
   public int getPassengers () {return passengers ;}

   public String toString()
   {
      String str=  "\nShip's Name :" + getName() +
              "\nMaximum Number of passengers: " + getPassengers();
              return str;
   }

   @Override
   public void display() {
      System.out.println("\nShip's Name :" + getName() +
              "\nMaximum Number of passengers: " + getPassengers());

   }
}

