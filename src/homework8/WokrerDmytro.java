package homework8;

public class WokrerDmytro {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Gordon", 53, " journalist", 100000);
        String workerName = worker1.getName();
        int workerAge = worker1.getAge();
        String workerPosition = worker1.getPosition();
        int workerSalary = worker1.getSalary();

        System.out.println("First our worker is " + workerName + ". He is " + workerAge + " years old. Work on"
                + workerPosition + " position with " + workerSalary + "$ salary");

    }
}
