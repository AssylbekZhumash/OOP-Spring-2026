package pr1;
import java.util.Scanner;
public class tsk4 {
    public static void main(String[] args) {
        System.out.println("What is your a,b,c?");

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = scanner.nextInt();

        if (a == 0) {
            System.out.println("Error");
        }
        double D = b * b - 4 * a * c;

        if (D < 0) {
            System.out.println("Error");
        } else {
            double sqrtD = Math.sqrt(D);
            double x1 = (-b + sqrtD) / (2 * a);
            double x2 = (-b - sqrtD) / (2 * a);

            System.out.println("x1 =" + x1);
            System.out.println("x2 = " + x2);
        }
        scanner.close();
    }

}



