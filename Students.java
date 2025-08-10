package Priyansh;

public class Students {
    public int roll;
    public String name;
    public String course;
    public int m1, m2, m3;

    public int total() {
        return m1 + m2 + m3;
    }

    public double average() {
        return (double) total() / 3;
    }

    public char grade() {
        if (average() >= 80) {
            return 'A';
        } else if (average() > 70) {
            return 'B';
        } else {
            return 'C';
        }
    }

    public String details() {
        return "Roll No: " + roll + "\nName: " + name + "\nCourse: " + course + "\n";
    }
}

class StudentTest {
    public static void main(String[] args) {
        Students s = new Students();
        s.roll = 1;
        s.name = "Kai";
        s.course = "IT";
        s.m1 = 55;
        s.m2 = 56;
        s.m3 = 45;

        System.out.println("Total: " + s.total());
        System.out.println("Average: " + s.average());
        System.out.println("Grade: " + s.grade());
        System.out.println("Details:\n" + s.details());
    }
}
