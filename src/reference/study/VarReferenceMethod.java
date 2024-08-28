package reference.study;

import reference.clazz.Book;

// 메소드 호출 시 파라미터로 값을 전달하는 것은 변수에 값을 대입하는 것과 같다.
// 이때, 기본형 파라미터 전달은 실제 값을 전달한다.
// 참조형 파라미터 전달은 참조값을 전달하므로 같은 인스턴스를 공유하게 된다.
public class VarReferenceMethod {
    public static void main(String[] args) {

        System.out.println("=====기본형 파라미터 메소드 호출=====");
        int before = 10;
        System.out.println("메서드 호출 전 before = " + before);
        changePrimitive(before);

        // 기본형은 실제값을 파라미터로 대입해서 전달하기 때문에, 메소드에서 새로운 값(20)을 대입했지만,
        // before는 변하지 않는다.
        System.out.println("메서드 호출 후 before = " + before);

        System.out.println();

        System.out.println("=====참조형 파라미터 메소드 호출=====");
        Book beforeBook = new Book();
        beforeBook.price = 10000;
        System.out.println("메서드 호출 전 beforeBook.price = " + beforeBook.price);
        changeReference(beforeBook);

        // 참조형은 참조값을 파라미터로 대입해서 전달하기 때문에, 메소드에서 인스턴의 필드값에 변화를 주면,
        // 전달전 객체도 변경된다.
        System.out.println("메서드 호출 후 beforeBook.price = " + beforeBook.price);

    }

    static void changePrimitive(int after){
        after = 20;
    }

    static void changeReference(Book afterBook) {
        afterBook.price = 20000;
    }
}
