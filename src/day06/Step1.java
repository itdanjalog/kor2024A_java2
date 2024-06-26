package day06;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class Step1 {
    public static void main(String[] args) {

        // 0. Set 컬렉션 객체 생성
        Set<Integer> set = new HashSet<>();
        // 0. set 컬렉션 객체에 5개의 요소 추가 [ 중복안됨 , 저장순서가 없음 ]
        set.add( 87 );  set.add( 98 );
        set.add( 75 );  set.add( 95 );
        set.add( 80 );
        // 0. set 컬렉션 객체 확인
        System.out.println("set = " + set);

        // 1. TreeSet
            // 이진 트리 구조 : 하나 값(노드)의 두 개의 값(노드,노드) 연결
            // 가장 작은 값을 왼쪽[노드] 에 저장하고 가장 큰 값을 오른쪽[노드] 에 저장하는 구조
            // 부모노드 기준으로 작으면 왼쪽노드 , 크면 오른쪽노드
            // 오름차순 처럼 크기순으로 저장을 하기 때문에 검색에 용이하다.
            /*
                                  노드
                         노드                 노드
                    노드      노드          노드    노드

             */

             /*
                                  87
                         75                   98
                    노드      80          95     노드

                    - 순회 방법 :왼쪽노드 -> 부모노드 -> 오른쪽노드  [ 중위 순회 ]

             */
        TreeSet<Integer> treeSet = new TreeSet<>();
        // 1. TreeSet 컬렉션 객체에 5개 요소 추가 
        treeSet.add( 87 ); treeSet.add( 98 );
        treeSet.add( 75 ); treeSet.add( 95 );
        treeSet.add( 80 );
        // 2. 확인
        System.out.println("treeSet = " + treeSet);
        // 3. 순회 : .forEach( 반복변수명 -> { 실행문; } )
        treeSet.forEach( i -> {  System.out.println("i = " + i);  } );
        // 4. 함수
        System.out.println("treeSet.first() = " + treeSet.first());  // .first() : 가장 왼쪽에 있는 노드 , 가장 작은 수
        System.out.println("treeSet.last()  = " + treeSet.last() ); // .last()  : 가장 오른쪽에 있는 노드 , 가장 큰 수
        System.out.println("treeSet.lower( 95 ) = " + treeSet.lower( 95 )); // .lower(기준값)  : 기준값 보다 작은 가장 가까운 작은 점수
        System.out.println("treeSet.floor( 95 ) = " + treeSet.floor( 95 )); // .floor(기준값)  : 기준값 보다 작거나같은 가장 가까운 작은 점수
        System.out.println("treeSet.higher( 95 ) = " + treeSet.higher( 95 )); // .higher(기준값) : 기준값 보다 큰 가장 가까운 큰 점수
        System.out.println("treeSet.ceiling( 95 )  = " + treeSet.ceiling( 95 ) );  // .ceiling(기준값) : 기준값 보다 크거나같은 가장 가까운 큰 점수
        System.out.println("treeSet.descendingSet()  = " + treeSet.descendingSet() ); // .descendingSet() : 내림차순 으로 반환
        // .tailSet( 기준값 , true )  : 기분값 보다 초과false , 이상true
        System.out.println("treeSet.tailSet( 80 ,true)  = " + treeSet.tailSet( 80 , false ) );   // 80 초과
        System.out.println("treeSet.tailSet( 80 ,true)  = " + treeSet.tailSet( 80 , true  ) );   // 80 이상
        // .subSet( 시작값 , true , 끝값 , true ) : 기준값 부터 끝값 까지 범위 검색
        System.out.println("treeSet.subSet( 80 , true , 90 , true ) = " + treeSet.subSet( 80 , true , 90 , true ));     // 80 ~ 90
        System.out.println("treeSet.subSet( 80 , true , 90 , true ) = " + treeSet.subSet( 80 , false , 90 , false ));   // 81 ~ 89

    }
}
