package day05;

import java.util.ArrayList;
import java.util.List;

public class Step1 {
    public static void main(String[] args) {

        // 1. 숫자 10를 저장할래.
        byte box1 = 10;

        // 2. 숫자 10 , 25 , 30 , 20000 를 4개 저장할래
        int[] box2 = new int[]{ 10 , 25 , 30 , 20000 };

        // 3. 숫자 10 과 문자열 '유재석' 를 저장할래
        int box3_1 = 10;    String box3_2 = "유재석";

        // 4. 숫자 10 과 문자열 '유재석' 을 하나의 상자/타입으로 저장할래 : 서로다른 타입을 하나의 타입으로
            // - 왜??? 서로 다른 타입을 하나로 묶어서 관리가 편하게 하기 위해
            // 나이(int) 와 이름(String)을 저장할게   => 변수2개
            // class{ 나이; 이름; }                 => 변수1개
        NewType box4 = new NewType();
        box4.mValue1 = 10; box4.mValue2 ="유재석";

        // 5. int와 String 을 여러개 저장하는 방법
            // [1] 배열            : 고정길이( 배열에 요소를 추가/삭제 하는데 전체길이 고정 )
                // - List 컬렉션들의 구현방법중 , 빠르다.
        NewType[] box5 = new NewType[100];
            // [2] List 컬렉션     : 가변길이( List에 요소를 추가/삭제 하는데 전체길이가 가변 )
                // - 다양한 기능제공 하므로 편리하다
        List< NewType > box6 = new ArrayList<>();

    }
}
/*
   자바에서의 저장 : 변수(변하는 수 )
   - 변수 선언하는 방법 : 타입 변수명 = 자료의값
   - 자바의 타입 종류
        --> 타입 : 자료들의 분류 , 분리수거처럼 변수를 분류 할때 적절하게 저장하자.
        1. 기본자료형 : 리터럴 들을 저장하는 변수의 타입
            boolean     1바이트    true or false
            char        2바이트    ' '감싼 문자1개
            byte        1바이트    -128 ~ 127
            short       2바이트    +-3만정도
            int         4바이트    +-20억정도
            long        8바이트    +-20억이상
            float       4바이트    소수 7자리 까지 표현
            double      8바이트    소수 16자리 까지 표현
        2. 참조자료형 : 클래스 , 인터페이스 , 배열[] 타입 으로 만들어진 객체들의 위치주소 저장.
            - 내가 만든 클래스/타입  , 만들어진 클래스/타입
            - 참조 : 무언가(인스턴스) 를 참고/가리키고/가리키는위치 하는 것
*/
