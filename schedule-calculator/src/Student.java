/**
 * @Author: Zhuang Xin
 * @CreateTime: 2024-01-04  15:57
 * @Description: TODO
 */

public class Student {
    private final Klass klass;
    private String name;
    private int age;

    public Student(String name, int age, Klass klass) {
        this.name = name;
        this.age = age;
        this.klass = klass;
    }

    public static void main(String[] args) {
        Student student = new Student("Tom", 19, new Klass(2, 3));
        System.out.println(student.introduce());
    }
    public String introduce() {
        return "My name is " + this.name + "." + " "
                + "I am a Student." + " "
                + "I am " + this.age + "old." + " "
                + "I am at Class " + this.klass.getKlassNumber() + " of Grade " + this.klass.getGradeNumber() + ".";
    }

    private static final class Klass {
        private final int klassNumber;
        private final int gradeNumber;

        private Klass(int klassNumber, int gradeNumber) {
            this.klassNumber = klassNumber;
            this.gradeNumber = gradeNumber;
        }

        public int getKlassNumber() {
            return klassNumber;
        }

        public int getGradeNumber() {
            return gradeNumber;
        }

    }
}