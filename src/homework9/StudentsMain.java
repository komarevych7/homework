package homework9;

public class StudentsMain {
    public static void main(String[] args) {
        Student mikola = new Student("Mikola", "Baskov", "Java-1", 4.5);
        Student vasya = new Student("Vasya", "Pupkin", "Java-1", 5);
        Student galya = new Aspirant("Galya", "Gordon", "Java-2", 5, true);
        Student marusya = new Aspirant("Marusya", 4);
        Student sahko = new Student("Sashko", 0);

        Student[] students = {mikola, vasya, galya, marusya, sahko};
        for (Student student: students) {
            System.out.println(student.getScholarship());
        }
    }
}
