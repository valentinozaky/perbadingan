public class Instrument {
   //variabel
    private String type;
   private double price;

   public String getType() {
       return this.type;
   }

   public void setType(String type) {
       this.type = type;
   }

   public double getPrice() {
       return this.price;
   }

   public void setPrice(double price) {
       this.price = price;
   }

    //constructor
    public Instrument() {
        type = "Guitar";
        price = 101.5; 
    }

    public Instrument(String t, double b) {
        type = t;
        price = b;
    }

    //getter
    //setter
    //method

    public void print() {
        System.out.println("Piano :" +200.0);
        System.out.println("Violin :" +150.0);
    }

}
    

    
