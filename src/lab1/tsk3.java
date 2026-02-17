package lab1;

public class tsk3 {
    private double value;
    private char scale;

    public tsk3() {
        this.value = 0;
        this.scale = 'C';
    }

    public tsk3(double value) {
        this.value = value;
        this.scale = 'C';
    }

    public tsk3(char scale) {
        this.value = 0;
        this.scale = scale;
    }

    public tsk3(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }

    public double getValue() {
        return value;
    }

    public char getScale() {
        return scale;
    }

    public double getCelsius() {
        if (scale == 'C') {
            return value;
        } else {
            return 5 * (value - 32) / 9;
        }
    }

    public double getFahrenheit() {
        if (scale == 'F') {
            return value;
        } else {
            return (9 * value / 5) + 32;
        }
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setScale(char scale) {
        this.scale = scale;
    }

    public void setTemperature(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }
    public static void main (String[] args){
        tsk3 t1 = new tsk3(25,'C');
        System.out.println("Value: " + t1.getValue());
        System.out.println("Scale: " + t1.getScale());
        System.out.println("In Celsius: " + t1.getCelsius());
        System.out.println("In Fahrenheit: " + t1.getFahrenheit());

    }

}

