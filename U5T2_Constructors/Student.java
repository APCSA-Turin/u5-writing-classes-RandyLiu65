package U5T2_Constructors;

/** 
 * This class represents a student object
 * 
 * @author Randy Liu
 * 
 */
public class Student {
    /** String instance variable that contains the student's name */
    private String name;
    /** int instance variable that stores the student's grade level */
    private int gradeLevel;
    /** Stiring instance variable that student's school */
    private String school;
  
    /** Instantiates the student object
     * 
     * @param name the student's name
     * @param gradeLevel the student's grade level
     * @param school the student's school
     */
    public Student(String name, int gradeLevel, String school) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.school = school;
    }
    /** Instantiates the student object, then evaluates what level of school the student
     * is in based on their grade level
     * 
     * @param name the student's name
     * @param gradeLevel the student's gradeLevel
     */
    public Student(String name, int gradeLevel) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        if (gradeLevel < 1) {
            school = "unknown";
        } else if (gradeLevel <= 5) {
            school = "elementary school";
        } else if (gradeLevel <= 8) {
            school = "middle school";
        } else if (gradeLevel <= 12) {
            school = "high school";
        } else {
            school = "unknown";
        }
    }

    /**
     * Returns the student's information in a string
     * 
     * @return the student's information
     */
    public String studentInfo() {
      /* implement me, as described above */
      return name + " is in grade " + gradeLevel + " and goes to " + school;
    }

}


  