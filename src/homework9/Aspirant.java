package homework9;

public class Aspirant extends Student {

    boolean scientificWork;

    public Aspirant(String firstName, double averageMark) {
        super(firstName, averageMark);
    }

    public Aspirant(String firstName, String lastName, String group, double averageMark, boolean scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    public String getScholarship() {
        if ( getAverageMark() == 5 ) {
            return getFirstName() + " have 200 uah scholarship.";
        } else if ( getAverageMark() > 0 && getAverageMark() < 5) {
            return getFirstName() + " have 180 uah scholarship.";
        } else {
            return "Can not calculate. No mark for " + getFirstName() + ".";
        }
    }
}
