package FRQs;

public class StepTracker {

    private int totalSteps;
    private int totalDays;
    private int activeDays;
    private int requiredSteps;

    public StepTracker(int requiredSteps) {
        this.requiredSteps = requiredSteps;
    }
    
    public void addDailySteps(int steps) {
        totalDays++;
        totalSteps += steps;
        if (steps >= requiredSteps) {
            activeDays++;
        }
    }
    
    public int activeDays() {
        return activeDays;
    }
    
    public double averageSteps() {
        if (totalDays == 0) {
            return 0;
        }
        return (double) totalSteps / totalDays;
    }
    
}