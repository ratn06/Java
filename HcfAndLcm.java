
import java.util.Scanner;

public class HcfAndLcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

//         int hcf = findHCF(num1, num2);
//         int lcm = findLCM(num1, num2);

//         System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
//         System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
//     }

//     public static int findHCF(int a, int b) {
//         if (b == 0) {
//             return a;
//         }
//         return findHCF(b, a % b);
//     }

//     public static int findLCM(int a, int b) {
//         return (a * b) / findHCF(a, b);
//     }
        int hcf = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
           
           
        }
        int lcm = (num1 * num2) / hcf;
            System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
            System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);

    }

}   