class Car{
    int  price;
    String color;
    int manufacturingYear;
     
     Car(int initialPrice,String initialColor,int initialManufacturingYear){
        price = initialPrice;
        color= initialColor;
        manufacturingYear = initialManufacturingYear;
         
     }

     
        
}
public class ConstructorBasic {
    
    public static void main(String[] args) {
        Car c1= new Car(12_00_000,"Dark Edition",2023);

        System.out.println("Car Price: " + c1.price + ", Car Color: " + c1.color + ", Car Manufacturing Year: " + c1.manufacturingYear);
    
    }
}
