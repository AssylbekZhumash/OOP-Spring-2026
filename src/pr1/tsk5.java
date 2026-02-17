package pr1;

public class tsk5 {
    public static void main(String[] args) {
      double balance = 1000;
      double interestRate = 10;
      double interest = balance * interestRate/100;
      double newbalance= balance + interest;


      System.out.println("Initial balance " + balance);
      System.out.println("Interest rate " + interestRate );
      System.out.println("With interest add "+ interest);
      System.out.println("New balance " + newbalance);
    }
}
