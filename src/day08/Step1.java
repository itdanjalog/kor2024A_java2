package day08;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Step1 {
    public static void main(String[] args) {
        
        // - 자바의 리터럴 : 객체가 아닌 순수 데이터 , 3 , 3.14 , 'a' , true , "문자열" 등등
        // 문자열이란 ? 문자 2개 이상 ,  문자char : '' 감싼 , 문자열String : " " 감싼
            // 변수1==변수2           : 두 변수가 갖는 ( 리터럴 ) 비교     , 리터럴 비교시에는 연산자 가능
            // 변수1.equals( 변수2 )  : 두 변수가 갖는 ( 객체주소 ) 비교    , 객체 비교시에는 연산자 불가능
        
        // [1] 문자
        char c1 = '김';  System.out.println("c1 = " + c1);
        char c2 = '김';  System.out.println("c2 = " + c2);
        System.out.println("(c1 == c2) = " + (c1 == c2));   // true

        // [2] 문자열
            // 1. " " 감싼 문자열은 리터럴로 상수 처리
        String str1 = "김민재";                System.out.println("str1 = " + str1);
        String str2 = "김민재";                System.out.println("str2 = " + str2);
        System.out.println("str1 == str2 = " + (str1 == str2) );    // true
            // 2. new String("문자열") 힙영역(객체) 생성
        String str3 = "김민재";    System.out.println("str3 = " + str3);
        System.out.println("(str3 == str2) = " + (str3 == str2) );  // false
            // 3. 객체내 '김민재' 가 리터럴 '김민재' 비교
        System.out.println("str3.equals(\"김민재\")  = " + str3.equals("김민재") ); // true




        // [3] 자주 사용되는 문자열 함수
            // 1. " ".charAt(인덱스) : 해당 인덱스번호의 문자 1개 반환
        String ssn = "880420-1230123";  // 주민등록번호 : 문자열타입
        char gender = ssn.charAt( 7 );  // 8[0] 8[1] 0[2] 4[3] 2[4] 0[5] -[6] 1[7]
        switch ( gender ){  // gender = 1
            case '1' :  // 만약에 1또는 3이면
            case '3' :
                System.out.println("gender + \"남\" = " + gender + "  남");
                break; // switch 탈출
            case '2' :  // 만약에 2 또는 4 이면
            case '4' :
                System.out.println("gender+\"여\" = " + gender+"  여");
                break;  // switch 탈출
        }
            // - 문자 입력받기
        Scanner scan = new Scanner(System.in); // 입력객체
        char _c = scan.next().charAt(0); // 문자열에서 0번째 인덱스 반환 , 문자 1개

            // 2.  " ".length() : 문자열 길이, 총 문자개수
        System.out.println("ssn.length()  = " + ssn.length() );
            // -
        for( int i = 0 ; i < ssn.length() ; i++ ){
            System.out.println("문자 1개씩 추출:" + ssn.charAt(i) );
        }

            // 3. " ".replace( "기존문자" , "새로운문자") : 기존문자를 새로운 문자로 치환/교체 반환
        String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
        // "자바" --> "JAVA" 교체/치환 후 새로운 문자열 반환
        String newStr = oldStr.replace( "자바" , "JAVA" );
        System.out.println("oldStr = " + oldStr); // ??? 그대로
        System.out.println("newStr = " + newStr);
            // - 특정 불필요한 데이터 대체 : 서로 다른 프로그래밍 언어 들간의 형식 변경 할때 주로 사용됨.
            // - HTML언어 에서 <br/> 줄바꿈 인데 자바 언어에서는 \n 줄바꿈 이기 때문에 치환
        String htmlStr = "안녕하세요<br/>유재석";
        String newHtmlStr = htmlStr.replace( "<br/>" , "\n" );
        System.out.println("newHtmlStr = " + newHtmlStr);

            // 4. " ".subString( 시작인덱스 , [끝인덱스]  )  : 문자열 잘라 내기
                // 끝인덱스는 생략 가능
        String ssn2 = "880815-1234567";
        String firsetNum = ssn2.substring( 0 , 6 );
        System.out.println("firsetNum = " + firsetNum);  // 880815

        String endNum = ssn2.substring( 7 );
        System.out.println("endNum = " + endNum); // 1234567;

            // 5. " ".split("구분문자")      : 문자열 분해 하기
        System.out.println("ssn2.split(\"-\")  = " + ssn2.split("-") );
        String[] strArray = ssn2.split("-");
        System.out.println("strArray[0]  = " + strArray[0] );
        System.out.println("strArray[1]  = " + strArray[1] );

            // 6. " ".indexOf("찾을문자")   : 문자열내 찾을문자 검색 , 찾았으면 찾은 인덱스 반환 , 못찾았으면 -1 반환
        String subject = "자바 프로그래밍";
        int findIndex = subject.indexOf("자바");
        System.out.println("findIndex = " + findIndex); // 0 : 찾을문자가 문자열내 첫번째 인덱스의 존재한다는 뜻

            // 7. " ".contains("찾을문자")  : 문자열내 찾을문자 검색 , 찾았으면 true 반환 , 못찾았으면 false 반환
        boolean findCheck = subject.contains("자바");
        System.out.println("findCheck = " + findCheck); // true : 찾을문자가 문자열내 존재[true]

            // 8. " ".getBytes() : 문자열내 문자 하나씩 바이트 변환후 바이트 배열로 반환
        System.out.println("subject = " + subject.getBytes() );
        byte[] bytes = subject.getBytes();
        System.out.println("bytes = " + bytes);

            // 9. new String( 바이트배열 ) : 해당 바이트배열을 문자열 반환
        String str4 = new String( bytes );
        System.out.println("str4 = " + str4);

            // -- 문자 와 바이트 관계 ----------------------------------------
                // 1. 영문/특수문자 : 1글자 당 1바이트
                // 2. 한글 : 1글자당 2바이트 + 1바이트(헤더규칙:UTF-8정보,자릿수) => 3바이트
        byte by1 = 'a';       System.out.println("by1 = " + by1);  // 97 : 'a'      // - 1바이트   : 아스키코드
        char ch1 = 65;        System.out.println("ch1 = " + ch1); // 65 : 'A'       // - 2바이트   : 유니코드 , ~ 65536글자  , short : +-3만
        char ch2 = '가';
        int in1 = ch2;          System.out.println("in1 = " + in1); // 44032 : '가'  //
        System.out.println( "가".getBytes().length );    // 3
        System.out.println( "a".getBytes().length );    // 1 :
            // -------------------------------------------
            // - 원래 자바에서 한글 문자는 기본적으로 지원되지 않기 때문에 EUC-KR , UTF-8(*) 이용한 인코딩 필요하다.
        try {
            String eucStr = new String("자바".getBytes(), "EUC-KR");
            System.out.println("eucStr = " + eucStr);
            String utfStr = new String("자바".getBytes(), StandardCharsets.UTF_8);
            System.out.println("utfStr = " + utfStr);
        }catch (Exception e ){ System.out.println("e = " + e);   }


    } // m end
} // c end 








