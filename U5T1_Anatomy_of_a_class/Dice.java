package U5T1_Anatomy_of_a_class;
public class Dice {

    private int sides;
    private int rollNum;
    private int rollCounter;

    public Dice(int sides) {
        this.sides = sides;
        rollNum = 0;
        rollCounter = 0;
    }

    public int getSides() {
        return sides;
    }

    public int getRollNum() {
        return rollNum;
    }

    public int getrollCounter() {
        return rollCounter;
    }

    public void roll() {
        int roll = (int) (Math.random() * sides) + 1;
        rollNum = roll;
        rollCounter++;
    }
    
}