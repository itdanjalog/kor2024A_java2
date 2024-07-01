package day07;

import java.awt.*;

public class Step1 {
    // main함수에 스레드(코드를 읽는/실행 흐름) 포함
    public static void main(String[] args) {
        // [1] 싱글스레드 예시
        System.out.println(">>싱글스레드 시작>>");
        // - Toolkit : JAVAUI 제공하는 클래스
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        toolkit.beep(); // '띵' 소리 출력하는 함수

        // 5번 비프음 내기  // - i는 0부터 5미만까지 1씩증가 반복처리
        for( int i = 0 ; i < 5 ; i++ ){
            toolkit.beep();
            // 반복문이 처리하는 속도보다 '띵' 소리가 출력되는 속도가 더 느리다.
            try { // try{} 예외가 발생 하거나 할것 같은 코드 { } 안에 넣는 구역. (경험이 중요한 작업 )
                // 현재 main스레드의 흐름을 일시정지
                Thread.sleep(1000);   // Thread.sleep( 밀리초 ) : 밀리초 만큼 코드흐름이 일시정지
                // 밀리초 : 1/1000 초 ,  1000=> 1초 , 100 => 0.1초 , 10 => 0.01초
                // Thread.sleep() : 외부로부터 오류가 발생할수 있으므로 무조건 일반예외 처리
            }catch ( Exception e ){ System.out.println(e);  }
            // catch( 예외클래스명 변수명 ){ } 예외발생시 실행되는 구역
        } // for end
        // 5번 문자열 출력
        for( int i = 0 ; i < 5 ; i++ ){
            System.out.println("띵");
            try{ Thread.sleep(1000); } catch ( Exception e ){ System.out.println(e);}
        }
        // ================================================================================ //
        System.out.println(">>멀티스레드 시작>>");
        Thread thread = new Thread(new Runnable() { // Thread 생성자 매개변수에 익명 구현 체 대입
            @Override // 추상메소드 재정의 하거나 부모 메소드를 상속받아 재정의
            public void run() {
                Toolkit kit = Toolkit.getDefaultToolkit();
                for( int i = 0 ; i < 5 ; i++ ){
                    kit.beep();
                    try{
                        Thread.sleep(1000);}catch (Exception e ){
                        System.out.println( e );
                    }
                } // for end
            } // run end
        });
        // 구현(객)체 : 인터페이스의 추상메소드를 구현한 클래스의 객체

        // 멀티스레드 실행
        thread.start();

        // 5번 문자열 출력
        for( int i = 0 ; i < 5 ; i++ ){
            System.out.println("띵");
            try{ Thread.sleep(1000); } catch ( Exception e ){
                System.out.println(e);
            }
        }



    } // main end
} // class end

