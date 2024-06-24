package day05;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Step4 {
    // static Set< Integer > setBox = new HashSet<>();  // 1. O , static변수 : 프로그램 시작시 할당 되고 종료시 초기화 , 전역용으로 사용
    // Set< Integer > setBox = new HashSet<>(); // 2. X , 멤버변수 , main함수가 static 이므로 , static 함수는 멤버변수를 사용할수 없다.

    public static void main(String[] args) {

        Set< Integer > setBox = new HashSet<>(); // 3. O , 메소드 안에서 선언하는 변수를 지역변수

        Scanner scanner = new Scanner(System.in);

        while(true){
            //Set< Integer > setBox = new HashSet<>(); // 4. O -> X , (코드자체문제X,로직문제O) while문이 반복할때마다 new 실행되기 때문에 반복 초기화 되므로
            System.out.print(" 정수 입력 : ");
            int value = scanner.nextInt();
            // 1. set컬렉션 저장
            setBox.add( value );         System.out.println("setBox = " + setBox);
            // 2. set컬렉션 조회 : set 컬렉션내 요소 하나씩 반복변수(아무거나)에 대입 반복처리
            setBox.forEach( 아무거나 -> { System.out.println("아무거나 = " + 아무거나); }  );
            /*
                무한정으로 입력받은 정수를 set컬렉션에 저장하고
                set컬렉션을 순회해서 하나씩 모든 요소를 출력하는 코드를 구현하시오.
             */
        }
    }
}
