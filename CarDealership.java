import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        Car[] cars = new Car[] {
            new Car("Nissan", 5000, 2020, "red", new String[] {"tires", "keys"}),
            new Car("Dodge", 8500, 2019, "blue", new String[] {"tires", "keys"}),
            new Car("Nissan", 5000, 2017, "yellow", new String[] {"tires", "filter"}),
            new Car("Honda", 7000, 2019, "orange", new String[] {"tires", "filter"}),
            new Car("Mercedes", 12000, 2015, "jet black", new String[] {"tires", "filter", "transmission"})
        };
      
         

        Dealership dealership= new Dealership(cars);

        System.out.println("\n ****** JAVA DEALERSHIP! ****** \n");        
        System.out.println("Feel free to browse through our collection of cars.\n");
        System.out.println(dealership);
        System.out.println("Which car are you interested in? (0 – 4).\n");
        int index = scan.nextInt();

        // sell car here... 
        dealership.sell(index);
        scan.close();

    }


}
import java.util.Arrays;

public class Car {
    private String make;
    private double price; 
    private  int year;
    private  String color;
    private String[] parts;
        
    /**
     * @param make
     * @param price
     * @param year
     * @param color
     * @param parts
     */
    public Car ( String make, double price, int year, String color,String[]parts ){
        this.make=make;
        this.price=price;
        this.year=year;
        this.color=color;
        this.parts=Arrays.copyOf(parts, parts.length);
    }
    public Car(Car source){
        this.make=source.make;
        this.price=source.price;
        this.year=source.year;
        this.color=source.color;
        this.parts=Arrays.copyOf(parts,parts.length);
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String[] getParts(){
        return Arrays.copyOf(parts,parts.length);
    }
    public void setParts(String[]parts){
        this.parts=Arrays.copyOf(parts,parts.length);
    }
    public void drive(){
        System.out.println("\nYou bought the beautiful  "+ this.year+ " "+ this.color+" "+this.make+" for "+this.price);
        System.out.println("Please drive your car to the nearst exist");
    }
    public String toString(){
    return "Make: " + this.make + ".\n" 
    +  "Price: " + this.price + ".\n"
    +  "Year: " + this.year + ".\n"
    +  "Color: " + this.color + ".\n"
    +  "Parts: " + Arrays.toString(parts) + ".\n";
    }
 
}
import java.util.Arrays;

public class Dealership {
    private Car[] cars;

    public Dealership(Car[] cars) {
        
        this.cars=new Car[cars.length];
        for(int i=0 ; i<this.cars.length;i++){
            this.cars[i]=new Car(cars[i]);
        }
    }

    
       
        public void sell(int index){
            this.cars[index].drive();
        }

        
        
        public String toString() {
            String temp = "";
            for (int i = 0; i < this.cars.length; i++) {
                temp += "Parking Spot: " + i + "\n";
                String carDescription = this.cars[i].toString();
                temp += carDescription + "\n";
            }
            return temp;

        }
    }
