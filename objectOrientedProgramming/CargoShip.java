
public class CargoShip extends Ship {
   private int tonnage;

   public CargoShip(String name, String yearBuilt, int tonnage) {
      super(name, yearBuilt);
      this.tonnage = tonnage;
   }
   public CargoShip(CargoShip obj2){
      tonnage = obj2.tonnage;
      this.setName(obj2.getName());
      this.setYearBuilt(obj2.getYearBuilt());
   }
   public void setTonnage(int tonnage){
      this.tonnage = tonnage;
   }
   public int getTonnage() {
      return tonnage;
   }
   public String toString() {
      String str ="\nShip's Name :" + getName() +

              "\nShip's Capacity in Tonnage :" + getTonnage();
      return str;
   }
   @Override
   public void display() {
      System.out.println("\nShip's Name :" + getName() +
              "\nShip's Capacity in Tonnage :" + getTonnage());

   }

}