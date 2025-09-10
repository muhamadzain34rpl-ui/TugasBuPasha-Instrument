public class Instruments {
    //property/atribut/variable
    private String name1, name2, name3, name4, name5;
    private double price1, price2, price3, price4, price5;

    //Default constructor
    public Instruments() {
        name1 = "Guitar";
        price1 = 1500000;

        name2 = "Piano";
        price2 = 3500000;

        name3 = "Drum";
        price3 = 2500000;

        name4 = "Violin";
        price4 = 6700000;

        name5 = "Flute";
        price5 = 1200000;
    }
    //Constructor parameter 
    public Instruments(String n, double p) {
        name1 = n;
        price1 = p;
    }
    
    //Getter
    public String getName1() {
        return name1;
    }

    public double getPrice1() {
        return price1;
    }
    //Setter
    public void setName1(String n) {
        name1 = n;
    }
    public void setPrice1(double p) {
        price1 = p;
    }

    public void display() {
        System.out.println("name: " + name1);
        System.out.println("Price: " + price1);

        
        System.out.println("name: " + name2);
        System.out.println("Price: " + price2);
        
        System.out.println("name: " + name3);
        System.out.println("Price: " + price3); 
            
        System.out.println("name: " + name4);
        System.out.println("Price: " + price4); 
        
        System.out.println("name: " + name5);
        System.out.println("Price: " + price5);
        
    }
    
}
