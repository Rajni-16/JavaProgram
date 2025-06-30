//elseIf- write a program to find a student rank based on %age of marks scored

import java.util.*;
public class elseIfConditions5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            System.out.println("enter sub 1 marks");
        int sub1 = sc.nextInt();
            System.out.println("enter sub 2 marks");
        int sub2 = sc.nextInt();
            System.out.println("enter sub 3 marks");
        int sub3 = sc.nextInt();
            System.out.println("enter sub 4 marks");
        int sub4 = sc.nextInt();
            System.out.println("enter sub 5 marks");
        int sub5 = sc.nextInt();
        double scoreSum = sub1 + sub2 + sub3 + sub4 + sub5;                            //find total scored marks
            System.out.println("Your total scored marks is " + scoreSum);
        double scorePercent = (scoreSum*100)/500;                                     //find scored percentage
            System.out.println("your scored percentage is " + scorePercent);
        if (scorePercent >= 90) {
            System.out.println("Passed with first division with distinction");
        } else if (scorePercent < 90 && scorePercent >= 80) {
            System.out.println("Passed with first division");
        } else if (scorePercent < 80 && scorePercent >= 35) {
            System.out.println("Just Passed");
        } else if (scorePercent < 35) {
            System.out.println("You have failed,try again next time");
        }
        else{
            System.out.println("Thank you");
        }
    }
}
