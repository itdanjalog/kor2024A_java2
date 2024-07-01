package day07;

import java.time.LocalTime;
import java.util.Scanner;

public class Step5 {

    public static void main(String[] args) {

        // [1] 전자 시계(현재시간)  LocalTime.now()  : 현재시간 을 반환하는 함수
        // System.out.println( LocalTime.now() );
        // 1. run메소드를 구현한 클래스의 객체 생성
        DigitalTime digitalTime = new DigitalTime();
        // 2. run메소드를 구현한 클래스의 객체를 Thread 생성자에 대입
        Thread thread = new Thread( digitalTime );
        // 3. run메소드를 실행 --> start()
        thread.start();

        Scanner scan = new Scanner(System.in);

        // [2] 타이머 설정 기능
        boolean timerState = false; // false :  중지상태 , true : 실행상태
        Thread thread2 = null;
        Timer timer = null;
        while ( true ){
            System.out.print("1.start 2. stop : ");
            int ch = scan.nextInt();
            if( ch == 1 && !timerState){ // 타이머 중지 일때만
                timer = new Timer();
                thread2 = new Thread( timer );
                thread2.start();
                timerState = true;
            }
            else if ( ch == 2 && timerState){ // 타이머가 실행중 일때만
                // thread2.stop();
                // -권장하지 않음. 실행도중에 강제종료 라서 안전하게 메모리 종료할수 없다.
                // 스위치변수 활용해서 on/off , true/false 표현식으로 run메소드를 안전하게 종료
                timer.state = false;
                timerState = false;
            }
        }
    }
}
