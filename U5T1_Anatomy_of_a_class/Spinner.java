package U5T1_Anatomy_of_a_class;
public class Spinner {
    
    private int sides;
    private int spinValue;
    private int spinCount;
    private int sum;

    public Spinner(int sides) {
        this.sides = sides;
    }

    public int getSpinValue() {
        return spinValue;
    }

    public int getSpinCount() {
        return spinCount;
    }

    public int getSpinSum() {
        return sum;
    }

    public double averageSpin() {
        return sum / spinCount;
    }

    public void spin() {
        spinValue = (int) ((Math.random() * sides) + 1);
        sum += spinValue;
        spinCount++;
    }



}
