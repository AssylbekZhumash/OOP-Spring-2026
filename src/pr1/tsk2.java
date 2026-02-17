package pr1;
import java.util.Scanner;

public class tsk2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Length ?");
        int a = scanner.nextInt();
        double b = a;

        System.out.println("Area:" + a*a);
        System.out.println("Perimeter" + 4*a);
        System.out.println("Diagonal" + Math.sqrt(2)*b);
    }

}
