package lab1;

import java.util.Scanner;

class Data {
    private double sum;
    private double max;
    private int count;

    public Data() {
        sum = 0;
        max = Double.NEGATIVE_INFINITY;
        count = 0;

    }

    public void addValue(double value) {
        sum += value;
        count++;
        if (value > max) {
            max = value;
        }
    }

    public double getAverage() {
        if (count == 0) return 0;
        return sum / count;
    }
    public double getMax(){
     if(count == 0) return 0;
     return max;

}

}
public class lab1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Data data = new Data();

        while(true){
            System.out.print("Enter number (Q to quit):");
            String input = scanner.nextLine();

            if(input.equalsIgnoreCase("Q")){
                break;
            }
            try{
                double value = Double.parseDouble(input);
                data.addValue(value);
            }catch (NumberFormatException e){
                System.out.println("Invalid input!Please enter a number or Q");
            }
        }
        System.out.println("Average =" + data.getAverage());
        System.out.println("Max = "+ data.getMax());

        scanner.close();
    }
}
