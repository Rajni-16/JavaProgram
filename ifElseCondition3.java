//else- if-  write a program to find a = b, or a is greater or a is lesser

import java.util.*;

public class ifElseCondition3 {
    public static void main(String[] args)
    {
      Scanner sc  = new Scanner(System.in);
        System.out.println("enter a");
      int a = sc.nextInt();
        System.out.println("enter b");
      int b = sc.nextInt();

      if(a == b){
          System.out.println("a is equal to b");
      }else if(a > b){
          System.out.println("a is greater than b");
      }
      else{
          System.out.println("a is lesser than b");
      }
    }
}
