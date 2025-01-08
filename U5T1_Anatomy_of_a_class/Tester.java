package U5T1_Anatomy_of_a_class;
public class Tester {
    public static void main(String[] args) {

        // Person person1 = new Person("Adam", "Jones");
        // Person person2 = new Person("John", "Smith");
        
        // person1.meet(person2);
        
        // System.out.println(person1.getMeetings());
        // System.out.println(person2.getMeetings());
        
        
        
        // person2.meet(person1);
        
        // System.out.println(person1.getMeetings());
        // System.out.println(person2.getMeetings());
        
        
        
        // Person person3 = new Person("Amy", "Jordan");
        // person3.meet(person2);
        
        // System.out.println(person1.getMeetings());
        // System.out.println(person2.getMeetings());
        // System.out.println(person3.getMeetings());
        
        StepTracker tr = new StepTracker(10000);
        System.out.println(tr.activeDays());
        tr.averageSteps();
        tr.addDailySteps(9000);
        tr.addDailySteps(5000);
        tr.activeDays();
        tr.averageSteps();
        tr.addDailySteps(13000);
        tr.activeDays();
        tr.averageSteps();
        tr.addDailySteps(23000);
        tr.addDailySteps(1111);
        tr.activeDays();
        tr.averageSteps();
        


    }
}
