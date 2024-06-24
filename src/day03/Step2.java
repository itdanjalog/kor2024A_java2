package day03;

import java.util.Timer;

public class Step2 {
    public static void main(String[] args) {

        Box box1 = new Box();
        box1.data = 30;   // - Object <--- int
            // ! : box객체 안에 있는 data 타입을 유연하게 사용하고 싶다.
            // 방안 : Object클래스( 자바내 최상위 클래스 )
                // - 상속 : 자식타입 --> 부모타입     ( 자동형변환)
                //          부모타입 --> 자식타입  ( 강제형변환 )
        int result1 = (int)box1.data; // ??? Object --> int

        Box box2 = new Box();
        box2.data = "자바";       // - Object <--- String
        String result2 = (String)box2.data; // ??? Object--> String

        // 제네릭 :
            // 특정한 타입을 지정하지 않고 유연하게 다양한 종류의 데이터를 처리

        // 제네릭타입을 가지는 클래스의 객체생성
            // Integer : int형 클래스
        Box2<Integer> box3 = new Box2<Integer>();
        box3.data = 3;  // box3 객체의 data멤버변수/필드의 타입은? Integer
        int result3 = box3.data;

        Box2<String> box4 = new Box2<>();
        box4.data = "자바"; // box4 객체의 data멤버변수/필드의 타입은? String
        String result4 = box4.data;

        // 멀티타입
        Box3< Integer , Double > box8 = new Box3<>();
        box8.data1 = 3; // 'box8'객체내 data1 속성의 타입은? Integer
        box8.data2 = 3.14; // 'box8'객체내 data1 속성의 타입은? Double
        System.out.println( box8.data1 + box8.data2 ); // 6.14

        Box3< Integer , String > box9 = new Box3<>();
        box9.data1 = 3;
        box9.data2 = "자바";
        System.out.println( box9.data1 + box9.data2 ); // "3자바"

        // 제네릭 다형성 제공 : < T extends 상위클래스 >
            // [1]
        Dog dog = new Dog();
        dog.name = "퍼피";
        Location<Dog> location = new Location<>();
        location.animal = dog;
            // [2]
        Tiger tiger = new Tiger();
        //Location< Tiger > location2 = new Location<>();
        //location2.animal = tiger;
            // - Tiger 클래스는 Animal 클래스로부터 상속 관계가 아니므로 불가능


    }
}












