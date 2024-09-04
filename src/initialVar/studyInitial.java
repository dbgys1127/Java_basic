package initialVar;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class studyInitial {

    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>(); //지역변수
        animalList.add(new Animal("dog", 70, 4)); //지역변수
        animalList.add(new Animal("eagle", 100, 2)); //지역변수
        animalList.add(new Animal("cat", 60, 4)); //지역변수

        printAnimalInfo(getLargestLegCntAnimal(animalList));
    }

    // 매개변수(파라미터)는 지역변수
    public static void printAnimalInfo(Animal a) {
        System.out.println("동물 이름 = "+a.name);
        System.out.println("동물 다리 개수 = "+a.legCnt);
    }

    // 매개변수(파라미터)는 지역변수
    public static Animal getLargestLegCntAnimal(List<Animal> animalList) {
        PriorityQueue<Animal> pq = new PriorityQueue<>(new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                if (o1.legCnt > o2.legCnt) {
                    return -1;
                } else if (o1.legCnt == o2.legCnt) {
                    return o2.height - o1.height;
                } else {
                    return 1;
                }
            }
        });

        for (Animal animal : animalList) {
            pq.add(animal);
        }
        return pq.poll();
    }
}
