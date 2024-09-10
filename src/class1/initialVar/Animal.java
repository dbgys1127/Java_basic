package initialVar;

import java.util.List;

public class Animal {
    String name; // 참조형 - 초기화 하지 않음
    int height; // 정수형 - 초기화 하지 않음

    boolean canEnterCafe; // 논리형 - 초기화 하지 않음

    int legCnt = 200; // 정수형 - 초기화 함

    public Animal() {
    }

    // 생성자의 매개변수(파라미터)는 지역변수
    public Animal(String name, int height, int legCnt) {
        this.name = name;
        this.height = height;
        this.legCnt = legCnt;
    }
}
