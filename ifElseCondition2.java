//if else - Write a program to find the odd/even number

import java.util.*;

public class ifElseCondition2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("a is even number");
        }
        else
        {
            System.out.println("a is an odd number");
        }


    }
}
