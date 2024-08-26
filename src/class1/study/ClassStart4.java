package class1.study;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1 = new Student("학생1", 15, 90);
        Student student2 = new Student("학생2", 16, 70);
        Student student3 = new Student("학생3", 17, 80);

        Student[] students = {student1, student2, student3};

        int i = 0;
        for (Student student : students) {
            System.out.println("이름 : "+student.getName()+" 나이 : "+student.getAge()+" 점수 : "+student.getGrade());
            System.out.println("student["+i+"] = " + student);
            i++;
        }

        System.out.println("students[0] = " + students[0]);
        System.out.println("students[1] = " + students[1]);
        System.out.println("students[2] = " + students[2]);


    }
}
