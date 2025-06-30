import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(" area of circle " + 3.14*(x*x));
        System.out.println("perimeter of circle" + 2*3.14*x);
        System.out.println("diameter of circle" + 2*x);
    }
}
