package class1.study;

public class ClassStart3_1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 91;

        Student student2 = new Student("학생2", 16, 70);
        Student student3 = new Student("학생3", 17, 80);

        Student[] students = {student1, student2, student3};

        for (Student student : students) {
            System.out.println("이름 : "+student.name+" 나이 : "+student.age+" 점수 : "+student.grade);
            System.out.println("student = " + student);
        }
    }
}
