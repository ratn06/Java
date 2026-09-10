public class Errorcheck {
    public static void main(String[] args) {
        int statuscode = 404;  ///
        int successcode = 200;
        boolean haserror = statuscode >= successcode;

        System.out.println("The system has any Error ? : " + haserror);
    }
    
}

