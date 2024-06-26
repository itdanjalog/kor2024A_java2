package day06;
/*
    컬렉션(수집) 프레임워크(미리 만들어진 클래스)
        - 저장,검색,조작, 자료구조(자료 저장/관리하는 방법) 제공
        - 편리하다
        - 자료구조 : 리스트,트리,스택,큐
    List 인터페이스 :    순서가 있는 데이터들의 목록
                        데이터 중복 O
                        ArrayList , LinkedList

    Set 인터페이스  :    순서가 없는 데이터들의 목록
                        데이터 중복 X
                        HashSet

    Map 인터페이스 :     key 와 value 의 쌍(entry)으로 이루어진 목록
                        key 중복 x , value 중복o
                        HashMap
*/

import java.util.*;

public class 복습 {
    public static void main(String[] args) {

        // 1. list 컬렉션  : 가장 많이 사용되는 컬렉션
        List< String > list = new ArrayList<>();

        // 2. set 컬렉션 : 중복을 제거할때
        Set<String> set = new HashSet<>();

        // 3. map 컬렉션 : JSON타입
        Map< String , Integer > map = new HashMap<>();

        // 인터페이스 : 추상메소드 를 이용한 다형성 표현할때 사용되는 문법

    }
}










