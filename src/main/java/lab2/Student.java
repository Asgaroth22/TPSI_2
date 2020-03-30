package lab2;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    private String groupId;
    private List<Double> grades = new ArrayList<>();

    public Student(String firstName, String lastName, String emailAddress, String groupId) {
        super(firstName, lastName, emailAddress);
        this.groupId = groupId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public double getGradesAverage() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
            return (sum / grades.size());
    }
}
