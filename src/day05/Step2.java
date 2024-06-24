package day05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Step2 {
    public static void main(String[] args) {

        // 컬렉션 프레임워크
            // List 인터페이스 : 저장된 요소의 순서대로 인덱스를 부여 함으로 인덱스를 요소를 식별한다. [ 중복허용 ]
                // 구현체 : ArrayList , LinkedList , Vector 클래스 등등
            // Set 인터페이스 : 저장된 요소의 순서가 없고 인덱스가 없으므로 식별이 불가능. 값 으로 식별한다. [ 중복허용 X ]
                // - 데이터들을 빠르게 중복제거 구현할때.
                // 구현체 : HashSet , TreeSet 클래스 등등
                    // 메소드
                    // .add( 요소 )       : 해당 요소를 set컬렉션 객체 추가한다.
                    // .size()            : 컬렉션내 총 요소 수
                    // .remove()         : 컬렉션내 특정 요소 삭제
                    // .iterator()      : 반복자 객체 반환
                        // .hasNext()   : 반복자의 다음 요소가 있는지 없는지 확인 함수 ,
                            // 다음이 존재하면 true / 없으면 false
                        // .next()      : 반복자의 다음 요소를 호출
        Set< String > setBox = new HashSet<>();
            // Set : set관련 클래스 객체 들을 조작할수 있는 인터페이스 타입
            // <String> : set 컬렉션에 저장할 제네릭 타입
            // setBox : 변수명
            // new HashSet<>(); : HashSet 객체/인스턴스 생성
        // 1. set컬렉션 요소 추가
        setBox.add( "JAVA");            System.out.println("setBox = " + setBox); // setBox = [JAVA]\
        setBox.add( "JDBC");            System.out.println("setBox = " + setBox); // setBox = [JAVA, JDBC]
        setBox.add( "JSP");             System.out.println("setBox = " + setBox); // setBox = [JAVA, JSP, JDBC]
        setBox.add( "SPRING" );         System.out.println("setBox = " + setBox); // setBox = [JAVA, SPRING, JSP, JDBC]
        setBox.add( "JAVA" );           System.out.println("setBox = " + setBox); // 중복이라서 불가능.( 덮어씌워진다 )
        // 2. set컬렉션의 총 요소 개수
        int size = setBox.size();
        System.out.println("size = " + size); // 4
        // 3. set컬렉션의 요소 삭제
        setBox.remove( "JSP" );         System.out.println("setBox = " + setBox); // setBox = [JAVA, SPRING, JDBC]
        
        // 4. 컬렉션 순회
            // 1. for문          [ 인덱스 없으므로 불가능 ] , where 대체 
        Iterator<String> rs = setBox.iterator();
        while ( rs.hasNext() ){ // 반복자가 다음 요소가 없을때까지 while 반복
            // 다음 요소를 호출
            System.out.println("rs.next()  = " + rs.next() );
        }
            // 2. 향상된 for문 [ iterator() 기반으로 만들어진 문법 ]
        for( String str : setBox ){
            System.out.println("str = " + str);
        }
            // 3. forEach() 함수
        setBox.forEach(  str -> System.out.println("str = " + str) );

    }
}










