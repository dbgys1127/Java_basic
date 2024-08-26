package class1.study;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] names = {"학생1","학생2","학생3","학생4"};
        int [] ages = {15,16,17,20};
        int[] grades = {90, 80,70,60};

        for (int i = 0; i < names.length; i++) {
            System.out.println("이름 : "+names[i]+" 나이 : "+ages[i]+" 점수 : "+grades[i]);
        }
    }
}
