// class Car{
//     int price;
//     String color;
//     String name;
//     int yearManufacture;
//     String model;
//     String note;
    
// }



  

// public class ObjectBasic {
//     public static void main(String[] args) {
//         Car c1 = new Car();
//         c1.price = 10_00_000;
//         c1.color = "Dark Edition";
//         c1.name = "Skoda";
//          c1.model = "Kylaq";
//         c1.yearManufacture = 2020;
//         c1.note = "My favorite car ,very fun to drive and this 1 ltr Turbo engine  in that price range u will feel like  weed when u drive it";
        
//         System.out.println("Car Price: " + c1.price+'\n' + "Car Color: " + c1.color + '\n' + "car Name: " + c1.name + '\n' +"Car Model: " + c1.model +'\n' + "Car Year Manufacture: " + c1.yearManufacture + '\n' + "About Car Note: " + c1.note);
    
//     }
// }



//Task 2

// class Car {
//     int price;
//     String color;

//     // 1. A basic method (No parameters)
//     void startEngine(String key) {
//         System.out.println("The " + key+ " to start the car's engine and the color of  the car is  " + color);
//     }

//     // 2. A parameterized method (It needs data to work)
//     // The 'int speed' inside the parentheses is the Parameter.
//     void accelerate(int speed) {
//         System.out.println("The car is now accelerating to " + speed + " km/h.");
//     }
//     //3. a method called updatePrice that takes an integer parameter newPrice and updates the price of the car to newPrice.
//     void updatePrice(int newPrice) {
//         price = newPrice;
//         System.out.println("The car's price has been updated to: " + price);
//     }
// }

// public class ObjectBasic {
//     public static void main(String[] args) {
        
//         Car c1 = new Car();
//         c1.color = "Dark Edition";
        
//         // This is how we TRIGGER the behaviors. We use the dot (.)
//         c1.startEngine("key needed ");
        
//         // Because accelerate() requires a number, we must pass one inside the parentheses.
//         c1.accelerate(80);

//         // Update the price of the car
//         c1.updatePrice(12_00_000);  
        
//     }
// }



// class Car{
//     int price;
//     String name;
//     String  color;


//     Car (int intialPrice, String intialName, String intialColor) {
//     price = intialPrice;
//     name = intialName;
//     color = intialColor;
//     //System.out.println("Car Price: " + price + ", Car Name: " + name + ", Car Color: " + color);
//     }
// }

// public class ObjectBasic {
//     public static void main(String[] args) {

//         Car c1 = new Car(10_00_000, "Skoda", "Dark Edition");
//         System.out.println("Car Price: " + c1.price + ", Car Name: " + c1.name + ", Car Color: " + c1.color);
        
//     }
// }