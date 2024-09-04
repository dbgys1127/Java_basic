package initialVar;

public class Animal {
    String name; // 멤버 변수
    int height;
    int legCnt; // 멤버 변수

    // 생성자의 매개변수(파라미터)는 지역변수

    public Animal(String name, int height, int legCnt) {
        this.name = name;
        this.height = height;
        this.legCnt = legCnt;
    }
}
