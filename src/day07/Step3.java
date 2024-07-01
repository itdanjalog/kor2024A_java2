package day07;

import java.awt.*;

class 비프음 implements Runnable{
    // -- 빨간줄/오류 이 뜨는 이유 :
    // implements 란 구현 하겠다는 뜻
    // 인터페이스내 추상메소드를 implements 해서 해당 클래스 재정의/구현 하겠다 뜻
    //  implements 했을때 재정의/구현 안하면 오류 발생
    @Override
    public void run() {
        Toolkit kit = Toolkit.getDefaultToolkit();
        for( int i = 0 ; i < 5 ; i++ ){
            kit.beep();
            try{
                Thread.sleep(1000);}catch (Exception e ){
                System.out.println( e );
            }
        } // for end
    } // METHOD END
} // CLASS END

public class Step3 {
    public static void main(String[] args) {

        비프음 b = new 비프음();
        Thread thread = new Thread( b );
        thread.start();

        // 5번 문자열 출력
        for( int i = 0 ; i < 5 ; i++ ){
            System.out.println("띵");
            try{ Thread.sleep(1000); } catch ( Exception e ){
                System.out.println(e);
            }
        }
    }
}
