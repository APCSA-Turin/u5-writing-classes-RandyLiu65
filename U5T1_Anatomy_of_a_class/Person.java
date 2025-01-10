package U5T1_Anatomy_of_a_class;
public class Person {
    
    private String first;
    private String last;
    private int meetCount;

    public Person(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public int getMeetings() {
        return meetCount;
    }

    public void setFirst(String newFirst) {
        first = newFirst;
    }

    public void increaseMeets() {
        meetCount++;
    }

    public void meet(Person person) {
        increaseMeets();
        person.increaseMeets();
        System.out.println("Hello, my name is " + getFirst() +
                           "\nHi, my name is " + person.getFirst()); 

    }
}