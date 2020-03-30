package lab2;

import java.util.ArrayList;
import java.util.List;

public class Faculty implements EmailRecipient {

    private String emailAddress;
    private String name;
    private List<Teacher> teachers = new ArrayList<>();


    public Faculty(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getEmailAddress() {
        return emailAddress;
    }
    
    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
}
