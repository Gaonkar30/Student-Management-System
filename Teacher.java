package sms;

public class Teacher {
    private int id;
    private String name;
    private int salary;

    // constructor
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // getters
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public int getSalary() {
        return salary;
    }
    // setter
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
