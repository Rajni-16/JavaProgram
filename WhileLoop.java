/* write a program to find the LCM of 2 numbers */

import java.util.Scanner;

public class WhileLoop {

    public static int findGCD(int a, int b) {                // find greatest common divisor
        while (b != 0) {
            int temp = b;
            b = a % b;                                      // remainder value, loop continues dividing a with b until b value becomes 0
            a = temp;
        }
        return a;
    }

    public static int findLCM(int a, int b){
       return Math.abs(a*b)/findGCD(a,b);                    // formula used to find LCM (a*b)/GCD(a,b), and Math.abs ensures result is always positive
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 1st number");
        int num1 = scanner.nextInt();

        System.out.println("enter 2nd number");
        int num2 = scanner.nextInt();

        int lcm  = findLCM(num1,num2);
        System.out.println("Lcm of" + num1 + "and" + num2 + "is:" + lcm);

        scanner.close();

    }

}

/*Notes
GCD(a,b)
GCD(48, 18)
= GCD(18, 48 % 18) = GCD(18, 12)
= GCD(12, 18 % 12) = GCD(12, 6)
= GCD(6, 12 % 6)   = GCD(6, 0)
→ GCD = 6

LCM formula  = a*b/GCD(a,b)
LCM= 48×18 /6
*/