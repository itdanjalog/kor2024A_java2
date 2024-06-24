package day05;

import java.util.*;

public class Step3 {
    public static void main(String[] args) {
        // 순회 하는 방법 정리
        int[] intArray = new int[]{ 10 , 20 ,30 ,40 , 50 , 60 , 70 , 80 , 90 , 100};
        List<Integer> intList = new ArrayList<>(Arrays.asList( 10 , 20 ,30 ,40 , 50 , 60 , 70 , 80 , 90 , 100 ) );
        Set<Integer> intSet = new HashSet<>( Arrays.asList( 10 , 20 ,30 ,40 , 50 , 60 , 70 , 80 , 90 , 100 ) );
        /*
            왜??? 배열 또는 컬렉션 내 내가 원하는 요소를 호출하기 위해
            1. for( int i = 0 ; i < 배열 또는 리스트길이 ; i++ ){ }
            2. for( 타입 반복변수명 : 배열 또는 컬렉션 ) { }
            3. 컬렉션명.forEach( 반복변수명 -> { } );
        */
        // [배열 ]
        for( int i = 0 ; i < intArray.length ; i++ ){ System.out.println("intArray[i] = " + intArray[i] ); }
        for( int value : intArray ){ System.out.println("value = " + value); }
        // [리스트]
        for( int i = 0 ; i< intList.size() ; i++ ){ System.out.println("intList.get(i)  = " + intList.get(i) );  }
        for( int value : intList ){ System.out.println("value = " + value);  }
        intList.forEach( value -> System.out.println("value = " + value) );
        // [ 세트 ]
        // 인덱스가 없으므로 i 을 이용한 for문 순회 는 불가능
        for( int value : intSet ){  System.out.println("value = " + value);   }
        intSet.forEach( value -> { System.out.println("value = " + value); } );
    }
}
