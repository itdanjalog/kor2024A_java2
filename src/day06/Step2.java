package day06;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Step2 {
    public static void main(String[] args) {

        // Map 컬렉션 : 여러개 entry(key,value) 저장/관리 하는 구조
        Map< String , Integer > map = new HashMap<>();
        map.put( "apple" , 100 );       map.put("forever" , 60 );
        map.put("description" , 40 );   map.put("ever" , 50 );
        map.put("zoo" , 80 );           map.put("base" , 20 );
        map.put("guess" , 70 );         map.put("cherry" , 30 );
        System.out.println("map = " + map);

        // TreeMap 컬렉션  : key 기준의 오름차순으로 정렬 , abc순:오름차순 cba:내림차순
        // 1. 선언
        TreeMap<String , Integer > treeMap = new TreeMap<>();
        // 2. 저장
        treeMap.put( "apple" , 100 );       treeMap.put("forever" , 60 );
        treeMap.put("description" , 40 );   treeMap.put("ever" , 50 );
        treeMap.put("zoo" , 80 );           treeMap.put("base" , 20 );
        treeMap.put("guess" , 70 );         treeMap.put("cherry" , 30 );
        System.out.println("treeMap = " + treeMap);
        // 3. 순회
        treeMap.entrySet().forEach( entry -> {
            System.out.println("entry = " + entry);
        });
        // 4. 함수
        System.out.println("treeMap.firstEntry()  = " + treeMap.firstEntry() ); // 가장 왼쪽(가장작은)에 엔트리
        System.out.println("treeMap.lastEntry()  = " + treeMap.lastEntry() );   // 가장 오른쪽(가장큰)에 엔트리
        System.out.println("treeMap.descendingMap()  = " + treeMap.descendingMap() ); // 내림차순으로 반환
        // c ~ h 까지의 범위 검색
        System.out.println("treeMap.subMap( \"c\" , true , \"h\",true )  = "
                + treeMap.subMap( "c" , true , "h",true ) );

    }
}
