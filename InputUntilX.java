import java.util.Scanner;
public class InputUntilX {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
         
        while(true){
            System.out.println("Enter a command (type 'x' to exit):");
            // char userInput = sc.next().charAt(0);
            String userInput = sc.nextLine();
            if(userInput.equalsIgnoreCase("x"))
                {
                System.out.println("Goodbye!");
                break;
            }
            System.out.println("You entered: " + userInput);
        }

    }
    
}
