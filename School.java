package sms;
import java.util.*;
public class School {
    private List<Student> students ;
    private List<Teacher> teachers ;
    private int totalMoneyEarned;
    private int totalMoneySpent;
    public School(List<Student> students, List<Teacher> teachers){
        this.students = students;
        this.teachers = teachers;
        this.totalMoneyEarned = 0;
        this.totalMoneySpent = 0;   
    }
    public void addStudents(Student student) {
        students.add(student);
    }
    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }
    public void updateMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }
    public void updateTotalMoneySpent(int MoneySpent) {
        totalMoneyEarned-=MoneySpent;
    }
    public List<Student> getStudents() {
        return students;
    }
    public List<Teacher> getTeachers() {
        return teachers;
    }
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }
}
