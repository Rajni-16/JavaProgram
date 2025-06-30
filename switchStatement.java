
//write a program to select 1 case out of all cases as per user input choice to perform selected Mathematical operation(+,-,*,/)

import java.util.*;
public class switchStatement {
    public static void main(String[] args) {
        int a = 60;
        int b = 40;
        System.out.println("enter your choice");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("sum of a and b " + (a + b));
                break;
            case 2:
                System.out.println("Mul of a and b " + (a*b));
                break;
            case 3:
                System.out.println("sub of a and b " + (a-b));
                break;
            case 4:
                System.out.println("Div of a and b " + (a/b));
                break;
            default:
                System.out.println("invalid choice ");
        }


    }
}
