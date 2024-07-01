package day08;

import java.util.Scanner;

public class Step2 {
    public static void main(String[] args) {

        // [실습1] 천단위 쉼표 표현하기
        // [조건] 금액 입력받아 천단위 쉼표 가 포함된 형식으로 출력하시오.
        // [입력1] 123456  [출력1] 123,456
        // [입력2] 1234567  [출력2] 1,234,567
        Scanner scan = new Scanner(System.in);
        System.out.print("금액 : ");  String money = scan.next();

        // - 천단위 쉼표가 포함된 문자열을 저장할 변수
        String result = "";
        // - 입력받은 문자열을 반복문으로 통해 문자 하나씩 순회
        for( int i = 0 ; i < money.length() ; i++ ){ // - i는 0부터 입력받은문자길이 까지 1씩 증가 반복
            //System.out.println("i = " + i); // i 출력
            //System.out.println("money.charAt( i )  = " + money.charAt( i ) ); // i번째 문자 출력
            //System.out.println("(money.length() - i)  = " + (money.length() - i) ); // 뒤 글자부터 반환
            // ---------------------- 조건 ------------------ //
            if( i > 0 && ( money.length() - i ) % 3 == 0  ){ // 뒤에서부터 자릿수가 3의 배수이면 //  배수찾기 : 값%배수 == 0 , 나머지가 0 이면 값은 그 배수
                result += ","; // 천단위 쉼표를 result 에 대입
            }
            // -- i번째 문자를 result 에 대입
            result += money.charAt(i);
            //System.out.println("result = " + result);
        }
        System.out.println("result = " + result);
        System.out.println("money = " + money);
    }
}











