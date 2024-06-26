package day04;

public class Step1 {

    public static void main(String[] args) {

        // 지역변수 : 함수안에서 선언된 변수
        int value = 3;
        // 같은 지역내 지역변수는 호출 가능
        System.out.println( value ); // 3

        // 멤버변수 호출
        Student student = new Student();
        System.out.println( student.school );

        // static변수 호출 , 객체 없이 static변수는 호출 가능
        System.out.println( Member.code );

        // 상속
        // 자식 객체 생성
        Student s1 = new Student();
        // 자식 객체를 부모 타입으로 형변환
        Member m1 = s1;
        // 부모 객체를 자식 타입으로 형변환,강제 ( 상속관계 가능 )
        Student s2 = (Student)m1; // 강제형변환 / 캐스팅

        student = new Student();


    }

}
