import java.util.Scanner;

public class PracticeNested {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int rows;
        int coloumn;
        char symbol;

        System.out.print("Enter the rows: ");
        rows = scanner.nextInt();
        
        System.out.print("Enter the coloumn: ");
        coloumn = scanner.nextInt();

        System.out.print("Enter the symbol: ");
        symbol = scanner.next().charAt(0);

        for(int i = 0;i<rows;i++){
            for(int j = 0 ;j<coloumn;j++){
                System.out.print(symbol);

            }
            System.out.println();
        }




        scanner.close();
    }
    
}
