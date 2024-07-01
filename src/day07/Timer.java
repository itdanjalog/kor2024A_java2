package day07;

public class Timer implements Runnable {
    public boolean state = true; // 타이머 상태
    public int second; // 타이머 초
    @Override
    public void run() {
        while ( state ){ // 무한루프
           try{ Thread.sleep(1000); } // 1초간 일시정지
           catch (Exception e ){ System.out.println( e );  }
           // 1초 증가.
           this.second++;
           System.out.println(">>timer = " + second);
        }
    } // r end
} // c end
