package lab2;

public class Main {

    public static void main(String[] args) {
        University zut = new University("Zachodniopomorski Uniwersystet Technologiczny w Szczecinie", "zut@zut.edu.pl");
        University wsks = new University("Wyższa Szkoła Kosmetologii Stosowanej w Koluszkach", "wsks@wsks.edu.pl");
        Faculty wi = new Faculty("Wydział Informatyki", "dzwi@zut.edu.pl");
        Faculty we = new Faculty("Wydział Elektroniczny", "dziekanat.we@zut.edu.pl");
        Person s1 = new Student("Jan", "Kowalski", "jkowalski@wi.zut.edu.pl", "32A");
        Person s2 = new Student("Hermenegilda", "Nowak", "henowak@wi.zut.edu.pl", "32A");
        Teacher t1 = new Teacher("Bjarne", "Stroustrup", "bjarne@fake.org", "Introduction to C++");

        EmailRecipient[] spamList = new EmailRecipient[7];
        spamList[0] = zut;
        spamList[1] = wsks;
        spamList[2] = s1;
        spamList[3] = s2;
        spamList[4] = t1;
        spamList[5] = wi;
        spamList[6] = we;

        for (EmailRecipient recipient : spamList) {
            String email = recipient.getEmailAddress();
            System.out.println(email);
        }

        Student s3 = new Student("Jan", "Kowalski", "jkowalski@wi.zut.edu.pl", "32A");
        s3.addGrade(3.0);
        s3.addGrade(4.0);
        double avg = s3.getGradesAverage();
        System.out.println(avg);
        zut.addFaculty(wi);
        zut.addFaculty(we);
        for (Faculty f : zut.getFaculties()) {
            System.out.println(f.getName());
        }
        we.addTeacher(t1);
        for (Teacher t : we.getTeachers()) {
            System.out.println(t.getFirstName());
        }
    }

}
