public class PlayInstrument {
    public static void main(String[] args) {
        Instrument a = new Instrument();
        Instrument b = new Instrument("Piano", 200.0);
        Instrument c = new Instrument("Violin" , 150.9);

        a.setType("Guitar");
        a.setPrice(101.5);

        b.setType("Piano");
        b.setPrice(200.0);  

        c.setType("Violin");
        c.setPrice(150.9);

        if (a.getPrice() > b.getPrice() && a.getPrice() > c.getPrice()) {
            System.out.println("Paling mahal adalah guitar");
        } else if (b.getPrice() > a.getPrice() && b.getPrice() > c.getPrice()) {
            System.out.println("Palig mahal adalah piano");
        } else {
            System.out.println("Paling mahal adalah viloin");
        }

        if (a.getPrice() < b.getPrice() && a.getPrice() < c.getPrice()) {
            System.out.println("Paling murah adalah gitar");
        } else if (b.getPrice() < a.getPrice() && b.getPrice() < c.getPrice()) {
            System.out.println("Palig murah adalah piano");
        } else {
            System.out.println("Paling murah adalah viloin");
            
        }

        a.print();     
        b.print();
        c.print();

        
    }
    
}

    
