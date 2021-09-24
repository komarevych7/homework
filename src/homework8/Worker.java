package homework8;

public class Worker {

    private String name;
    private int age;
    private String position;
    private int salary;

    public Worker (String name, int age, String position, int salary) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }

    public Worker (){
        name = "Gordon";
        age = 18;
        position = "trudyaga";
        salary = 10;
    }

    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public String getPosition () {
        return position;
    }

    public void setPosition (String position) {
        this.position = position;
    }

    public int getSalary () {
        return salary;
    }

    public void setSalary (int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

}
