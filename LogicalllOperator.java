public class LogicalllOperator {
  public static void main(String[] args) {

    /*int myAge = 22;
    
    boolean hasLicense = true;


    if(myAge >=18  && hasLicense)
    {
        System.out.println("Is He can drive : yes");
    }
    else 
    {
        System.out.println("Is he can Drive: No");
    }*/
   int myAge =24;
   boolean hasPermission = true;
   if (myAge>=18 ||  hasPermission)
   {
    System.out.println("Allowed");
   }
   else{
    System.out.println("Not Allowed");
   }
    if(myAge>=24 || hasPermission)
    {
        System.out.println("Can Access");
    }
    else{
        System.out.println("Cannot Access");
    }
    if (myAge>= 24 || ! hasPermission )
    {
        System.out.println("Access Allowed");

    }
    else{
        System.out.println("Access Denied");
    }
  }

}

