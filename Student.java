package sms;

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int totalFees;
    // constructor
    public Student(int id, String name, int grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;// inital fee paid
        this.totalFees = 30000; // same total fee
    }

    //getters
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getGrade(){
        return grade;
    }
    public int getFeesPaid(){
        return feesPaid;
    }
    public int getTotalFees(){
        return totalFees;
    }
    
    // setters
    public void setGrade(int grade){
        this.grade = grade;
    }

    // we wont need to set name and id
    public void updatefeepaid(int fees){
        feesPaid+=fees;
        School.updateMoneyEarned(feesPaid);
    }
    public int getRemainingFees(){
        return totalFees - feesPaid;
    }

}
