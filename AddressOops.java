
 class Address {
    String city = "Bengaluru";
    String country = "India";

    void displayAddress()
    {
        System.out.println("City: " + city + ", Country: " + country);
    }
}

class Student
{
    String name = "John Deer";
    int rollno = 69;

    // Direct reference to another class
    Address address = new Address();  // Object created directly inside the class

    void displayInfo()
    {
        System.out.println("Name: " + name + ", Roll No: " + rollno);
        address.displayAddress();
    }
}

public class AddressOops
{
    public static void main(String[] args)
    {
        Student student = new Student();  // No need to pass Address
        student.displayInfo();            // Displays student info along with address
    }
    
   
}
