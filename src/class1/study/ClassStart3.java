package class1.study;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1 = new Student("학생1", 15, 90);
        Student student2 = new Student("학생2", 16, 70);
        Student student3 = new Student("학생3", 17, 80);

        Student[] students = {student1, student2, student3};

        for (Student student : students) {
            System.out.println("이름 : "+student.getName()+" 나이 : "+student.getAge()+" 점수 : "+student.getGrade());
            System.out.println("student = " + student);
        }
    }
}
