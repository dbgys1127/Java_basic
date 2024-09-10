package class1.reference.study;

import class1.reference.clazz.Book;

public class VarChange {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.price = 10000;

        //book2에 book1을 대입한다. 이때, book1의 참조값이 대입된다.
        System.out.println("=====변수 대입=====");
        Book book2 = book1;
        System.out.println("book1 = " + book1);
        System.out.println("book2 = " + book2);

        //참조값이 대입된다는 것은 같은 메모리 주소에 접근하는 것이고, 객체에 접근할 수 있는 방법이 하나 더생긴것
        //따라서, book2는 book1과 같은 price를 갖는다.
        System.out.println("book1.price = " + book1.price);
        System.out.println("book2.price = " + book2.price);
        System.out.println("book2.equals(book1) = " + book2.equals(book1));
        System.out.println();

        //book1의 price 변경 정말 같은 객체에 접근하는지 확인해보기 book1.price 10000 -> 20000
        System.out.println("=====객체의 데이터 변경시 같은 참조값을 사용하는 변수의 값 확인=====");
        book1.price = 20000;
        System.out.println("book1.price = " + book1.price);
        System.out.println("book2.price = " + book2.price);
        System.out.println("book1.price==book2.price = " + (book1.price == book2.price));

        //정리
        //참조형은 변수에 값을 대입하면 값이 복사되는데 이때, 참조값(인스턴스가 저장된 메모리주소)이 저장된다.
        //같은 참조값을 갖는 다는것은 인스턴스를 공유하는 것과 같아서, 어느 한 변수에서 객체에 변경을 하면, 다른 변수에서 변경된 값이 조회된다.
    }
}
