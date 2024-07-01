package day08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Step3 {
    public static void main(String[] args) {

        // [1] 스트림
        //  - 데이터가 다니는 통로 , [ * 바이트 단위로 이동 ]
        //  - 자바 외 외부와 통신할때 주로 사용 ( 키보드,파일,DB,모니터,네트워크 등등 )
        // [2] 파일 관련 스트림
            // 1. FileOutputStream      : 자바 외 파일과 연동 하고 내보내기 관련 기능/메소드 제공한다.
                // - new FileOutputStream("파일경로") : 해당 경로의 파일과 연동 , 해당 경로의 파일이 없으면 파일 생성
                // - new FileOutputStream("파일경로" , true ) : 해당 경로의 파일과 연동 , 해당 경로의 파일이 없으면 파일 생성 , 이어쓰기
            // 2. .write( 바이트배열 )   : 해당 바이트배열을 연동된 파일에 쓰기 처리

            // 3. FileInputStream       : 자바 외 파일과 연동 하고 불러오기 관련 기능/메소드 제공한다.
                // - new FileInputStream("파일경로")    : 해당 경로의 파일과 연동
            // 4. .read( 바이트배열 )    : 해당 바이트배열을 연동된 파일에 출력/쓰기 처리

        // [3] 경로
            // 1. 상대경로  : 현재 파일의 기준으로 해당 파일 찾아가는 path 방법 , ./src/fileout1.txt
            // 2. 절대경로  : 모든 경로를 기준으로 해당 파일 찾아가는 path 방법 , D:\김현수\kor2024A_java2\src\fileout1.txt

        // 1. 파일내 데이터 쓰기/내보내기 
        try {
            // 1-1 : 해당 생성자 매개변수의 넣은 경로가 존재하면 파일 연동  아니면 파일 생성
            FileOutputStream fout = new FileOutputStream("./src/fileout1.txt" , true );
            // 1-2 : 파일내 작성할 문자열 준비
            String outStr = "자바 프로그래밍";
            // 1-3 : 준비한 문자열을 바이트배열로 변환후 바이트배열에 저장
            byte[] outStrArray = outStr.getBytes();
            // 1-4 : 변환된 바이트 배열을 파일과 연동된 객체 .wrtie( 바이트배열 )
            fout.write( outStrArray );
        }catch (Exception e ){ System.out.println("e = " + e);  }
        
        // 2. 파일내 데이터 불러오기
        try {
            // 2-1 : 해당 생성자 매개변수의 넣은 경로가 존재하면 파일 연동
            FileInputStream fin = new FileInputStream("./src/fileout1.txt");
            // 2-2 : 바이트(영문1,한글:2 여러개를 저장할 바이트 배열  선언
            byte[] inStrArray = new byte[100];
            // 2-3 : 파일과 연동된 객체 .read( 바이트배열 );
            fin.read( inStrArray );
            // 2-4 : 바이트배열을 문자열 변환
            String inStr = new String( inStrArray );
            System.out.println("inStr = " + inStr);
            
        }catch (Exception e ){  System.out.println("e = " + e);  }

        // 실습1 : 공공데이터 ( CSV : , 와 \n 으로 구분된 형식 )파일 다루기
            // CSV 형식 : ,(쉼표) 열구분용   \n(줄바꿈) 행구분용
            // 1. 불러오기 할 파일의 경로(확장자 필수)
        String path = "./src/day08/전국관광지정보표준데이터.csv";
        try {
            // 2. 파일 불러오기 객체 , 일반예외 발생한다. try{}catch(){}
            FileInputStream inputStream = new FileInputStream(path);
                // -------- 불러올 파일의 용량[ 바이트 길이 ] ---------
                File file = new File( path ); // 해당 파일의 경로
                file.length();  // 해당 파일의 용량[바이트길이] (long)반환
            // 3. 파일의 용량/바이트길이 만큼의 바이트 배열을 선언
            byte[] bytes = new byte[ (int)file.length() ];
            // 4. 해당 바이트배열에 연동된 파일의 내용을 바이트로 읽어오기/저장
            inputStream.read( bytes );
            // 5. 바이트배열 --> 문자열 변환
            // String inStr = new String( bytes , "UTF-8");  // - 파일원본 자체의 인코딩 타입 알아야 한다.
            String inStr = new String( bytes , "EUC-KR");   // - 파일원본 자체의 인코딩 타입 알아야 한다.
            // System.out.println("inStr = " + inStr);
            // - 가공
            System.out.println( inStr.split("\n")[0] ); // 첫번째 행    , \n : 줄바꿈
            System.out.println( inStr.split("\n")[1] ); // 두번째 행
            System.out.println( inStr.split("\n")[1].split(",")[0] );   // 두번째 행의 첫번째 열 ,  , : 열 구분

        }catch (Exception e ){  System.out.println("e = " + e); }

    }
}











