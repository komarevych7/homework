package homework8;

public class User {
    private String name;
    private int age;
    private String accountStatus;

    public User (String name, int age, String accountStatus) {
        this.name = name;
        this.age = age;
        this.accountStatus = accountStatus;
    }

   public User (String name, String accountStatus) {
        this.name = name;
        this.accountStatus = accountStatus;
    }

    public User () {
        name = "Default Name";
        age = 18;
        accountStatus = "Deleted";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }
}
