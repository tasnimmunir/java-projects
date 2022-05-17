public abstract class Ship implements Displayable{

   private String name;
   private String yearBuilt;

   public Ship(String name,String yearBuilt) {
        this.name=name;
        this.yearBuilt= yearBuilt;
    }
    public Ship(){}

    public void setName(String name){
        this.name=name;
    }
    public String getName() {return name;}

    public void setYearBuilt( String yearBuilt){
        this.yearBuilt=yearBuilt;
    }
    public String getYearBuilt() {return yearBuilt;}

    public String toString()
    {String str = "Ship's Name: "+ getName()+
            "\nBuilt Year: "+getYearBuilt();
        return str;
    }
    @Override
    public abstract void  display() ;

}

