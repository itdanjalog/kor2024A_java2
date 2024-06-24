package day05;

import java.util.HashMap;
import java.util.Map;

public class Step5 {
    public static void main(String[] args) {

        /*
            List 컬렉션      : 저장되는 순서대로 인덱스를 부여 하고 , 중복 가능
            Set 컬렉션       : 저장되는 순서가 없고 인덱스를 사용하지 않는다, 중복 불가능
            Map             : key 와 value 를 한쌍(Entry) 을 관리하는 구조 , key:중복불가능 / value:중복가능
                - 선언하는 방법
                    Map< Key타입 , Value타입 > 컬렉션변수명 = new HashMap<>();
                - 메소드
                    .put( key , value ) : map 컬렉션에 key 와 value를 한쌍(entry)으로 추가
                    .get( key )         : map 컬렉션내 해당하는 key의 value 반환
                    .size()             : map 컬렉션의 entry 총 개수 반환
                    .remove( key )      : map 컬렉션의 해당하는 key의 entry 삭제
                    .entrySet()         : map 컬렉션의 모든 entry를 set컬렉션 반환
                    .keySet()           : map 컬렉션의 모든 key를 set컬렉션 반환
                    .values()           : map 컬렉션의 모든 value를 Collection컬렉션 반환
        */
        // 선언
        Map< String , Integer > map = new HashMap<>();
        // 엔트리 저장
        map.put( "유재석" , 85);
        map.put( "홍길동" , 90 );
        map.put( "동장군" , 100 );
        map.put( "홍길동" , 95 );  // key 값이 중복일때는 새로운 엔트리 로 대치
        System.out.println("map = " + map);
        // 엔트리의 값 호출 
        System.out.println("map.get(\"동장군\")  = " + map.get("동장군") );
        // 엔트리의 개수 확인
        System.out.println("map.size() = " + map.size());
        // 특정 엔트리를 삭제
        map.remove( "동장군" );            System.out.println("map = " + map);
        // 순회[ 모든 엔트리를 조회 ]
            // 1. 엔트리 조회
        map.entrySet().forEach( entry -> { System.out.println("entry = " + entry );  } );
            // 2. key 조회
        map.keySet().forEach( key -> {
            System.out.println("key = " + key);
            System.out.println("map.get(key)  = " + map.get(key) );
        });
            // 3. value 조회
        map.values().forEach( value -> { System.out.println("value = " + value); });
    }
}
