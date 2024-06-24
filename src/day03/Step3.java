package day03;

import java.util.ArrayList;
import java.util.List;

public class Step3 {
    public static void main(String[] args) {

        /*
            -컬렉션 프레임워크
                컬렉션=수집
                프레임[ 처리 방식을 공식화한 것을 뜻] 워크[일]
                => 수집 관련 처리 방식을 공식화한 것으로 일처리 제공
            - 수집 관련
                데이터 1개 저장 = 변수
                데이터 여러개 저장 = 배열 = 수집
                    - 단점 : 고정길이 , new int[10] , 선언과 동시에 배열의 길이는 고정이다.
            - 컬렉션 프레임워크 사용하는 이유
                1. 배열은 한번 정한 크기를 변경하거나 삭제할수 없다. [ 재할당이면 가능 ]
                2. 별도의 기능/함수가 없기 때문에 활용성이 적다.
                3. 자바 회사에서 편리하게 사용 가능한 도구 제공 => 컬렉션 프레임워크
                4. 자료구조 제공 : 자료를 저장하는 방법론
                즉] 기존에 존재했던 자료구조에 인터페이스로 설계된 기능을 클래스를 통해 제공하여 용이한 자료구조 객체 만들수있다.

            - 종류
                -인터페이스 : Collection , List , Set , Map 등등
                -클래스 :
                    List : ArrayList , LinkedList , Vector 등
                    Set : HashSet ,  LinkedSet , TreeSet 등
                    Map : HashMap , TableMap , LinkedHashMap , TreeMap , Properties 등

                * 서로 다른 클래스(객체)들을 동일한 목적하의 서로 다른 로직 처리 하기 위해서
        */

        // List 인터페이스 컬렉션  : 순서가 있는 데이터의 집합 ( 인덱스 존재 ) , 중복 허용 O
            // 1. ArrayList 클래스 :
        List<Integer> list = new ArrayList<>();
            // 2. list 객체의 값 추가
        list.add( 10 ); list.add( 20 ); list.add( 30 ); list.add( 40 ); // 가변길이

        // vs 배열
        Integer[] array = new Integer[3];
        array[0] = 10; array[1] = 20; array[2] = 30; // 고정길이

    }
}
