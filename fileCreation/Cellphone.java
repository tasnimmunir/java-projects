//  Cellphone.java
// A class that represents one record of information.

public class Cellphone {
   private String model;
   private String manufacturer;
   private double retailprice;
   

   public Cellphone() {
      this("", "", 0);
   }

   // initialize a record
   public Cellphone( String model, String manufacturer, double retailprice) {
      setModel(model);
      setManufacturer(manufacturer);
      setRetailprice(retailprice);
   } 


   public void setModel(String model) {
      this.model = model;
   }
   public String getModel() {
      return model;
   } 


   public void setManufacturer(String manufacturer) {
      this.manufacturer = manufacturer;
   }
   public String getManufacturer() {
      return manufacturer;
   } 


   public void setRetailprice(double retailprice) {
      this.retailprice = retailprice;
   }
   public double getRetailprice() {
      return retailprice;
   } 

}
