package homework9;

public class Student {

    private String firstName, lastName, group;
    private double averageMark;

    public Student (String firstName, String lastName, String group, double averageMark){
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }
    public Student (String firstName, double averageMark){
        this.firstName = firstName;
        this.averageMark = averageMark;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public String getScholarship() {
        if ( averageMark == 5 ) {
            return getFirstName() + " have 100 uah scholarship.";
        } else if ( averageMark > 0 && averageMark < 5) {
            return getFirstName() + " have 80 uah scholarship.";
        } else {
            return "Can not calculate. No mark for " + getFirstName() + ".";
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", group='" + group + '\'' +
                ", averageMark=" + averageMark +
                '}';
    }
}
