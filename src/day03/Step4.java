package day03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Step4 {
    public static void main(String[] args) {
        
        // List인터페이스 =
            // 1. ArrayList 클래스     : 검색 , 순차 삽입 할때 용이/빠르다.
            // 2. LinkedList 클래스    : 중간 삽입 , 삭제 할때 용이/빠르다.
            // .add( 객체 )                   : 해당 객체를 리스트내 순차적으로 삽입
            // .get( 인덱스 )                 : 해당 인덱스의 객체요소 호출
            // .set( 인덱스 , 새로운값 )       : 해당 인덱스의 새로운값으로 치환/수정
            // .remove( 인덱스 )              : 해당 인덱스의 객체요소 삭제 , 삭제된 요소 뒤로 한칸씩 당겨짐.
            // .size()                       : 리스트내 객체요소 총길이/개수 반환
            // .contains( 객체 )              : 리스트내 해당 객체가 존재하면 true             없으면 false
            // .indexOf( 객체 )               : 리스트내 해당 객체가 존재하면 찾은 인덱스반환     없으면 -1
            // .clear()                      : 리스트내 요소들을 전체 삭제
            // .isEmpty()                   : 만일 리스트내 요소가 1개도 존재하지 않으면 true 아니면 false

        List<String> list1 = new ArrayList<>();
            // List : list 인터페이스
            // <타입> : list 객체 내 저장할 객체의 타입
            // list1 : list객체명(임의)
            // new : 인스턴스화
            // ArrayList<>() : 생성자<>()        // <> 생략 가능
        // 2. list객체내 객체요소 추가 
        list1.add("사과");    System.out.println("list1 = " + list1); // list1 = [사과]
        list1.add("바나나");   System.out.println("list1 = " + list1); // list1 = [사과, 바나나]
        list1.add("딸기");     System.out.println("list1 = " + list1); // list1 = [사과, 바나나, 딸기]

        // 3. list객체내 특정 객체요소 호출
        String str = list1.get( 1 );    System.out.println("str = " + str); // 바나나

        // 4. list객체내 특정 객체요소 수정
        list1.set( 1 , "수박" );
        str = list1.get( 1 );           System.out.println("str = " + str); // 수박

        // 5. list객체내 특정 객체요소 삭제
        list1.remove( 2 );              System.out.println("list1 = " + list1); // list1 = [사과, 수박]

        // 6. list객체내 객체요소의 총 길이/개수
        int size = list1.size();        System.out.println("size = " + size); // 2

        // 7. list객체 순회/전체호출
        // [1] 기본 for문
        for( int i = 0 ; i < list1.size() ; i++ ){
            System.out.println("list1 = " + list1.get(i) );
        }

        // [2] 향상된 for문
        for( String s : list1) { System.out.println("s = " + s);  }

        // [3] 스트림 forEach함수
        list1.forEach( (s) -> {  System.out.println("s = " + s);  });

        // 8.
        boolean bool = list1.contains( "수박" );     // list객체내 해당 객체가 존재하면 true 없으면 false
        int index = list1.indexOf("수박");        // list객체내 해당 객체가 존재하면 찾은 인덱스반환 없으면 -1

        // 9.
        list1.clear();  // 리스트내 전체 요소 삭제
        list1.isEmpty(); // 만일 리스트내 요소가 1개도 존재하지 않으면 true 아니면 false

        // ========================================== //
        ArrayList<Integer> 리스트 = new ArrayList<>();
        LinkedList<Integer> 링크리스트 = new LinkedList<>();

        // 1. 리스트가 100000개 저장하는데 걸리는 시간
        long sTime = System.currentTimeMillis();
        for( int i = 0 ; i<100000 ; i++ ){
            리스트.add( 0 , i );
        }
        long eTime = System.currentTimeMillis();
        System.out.println("(eTime-sTime)  = " + (eTime-sTime) );

        // 2. 링크리스트가ㅣ 100000개 저장하는데 걸리는 시간
        sTime = System.currentTimeMillis();
        for( int i = 0 ; i<100000 ; i++ ){
            링크리스트.add( 0 , i );
        }
        eTime = System.currentTimeMillis();
        System.out.println("(eTime-sTime)  = " + (eTime-sTime) );

    }
}













