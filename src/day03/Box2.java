package day03;

// 클래스 내부에서 사용할 매개타입을 받아서 사용
// class 클래스명<제네릭타입>{ }
public class Box2<X> {
    X data;
}
// 제네릭 멀티타입 파라미터
class Box3< X ,Y >{
    X data1;
    Y data2;
}
// 제네릭 상속관계
class Animal{   String name; }
class Dog extends Animal{ }
class Tiger { }

class Location< T extends Animal >{  T animal; }
