
//if else - write a program to find if Adult as per input age

import java.util.*;
  public class ifCondition1{
    public static void main(String[] args) {
        System.out.println("Please input your age:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age>18)
        {
            System.out.println("Yeh!You are an adult be responsible");
        }
        else
        {
            System.out.println("Oops! Not an adult");
        }
    }
}
