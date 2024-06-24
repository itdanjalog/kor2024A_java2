package day02;

import javax.swing.plaf.PanelUI;

public class Account {

    // 1. 필드
    private long balance;   // 예금액
    // 2. 생성자
    public Account(){}
    // 3. 메소드
        // getter : private 필드을 외부로부터 반환해주는 함수
    public long getBalance(){ // 예금 확인 함수
        return balance;
    }
    public void deposit( int money ){ // 입금 함수
        this.balance += money;
    }
    public void withdraw( int money ) throws 잔고부족예외{ // 출금
        if( this.balance < money ){
            // 만약에 예금액이 출금액보다 작으면  ( 돈이 부족함 )
                throw new 잔고부족예외("잔고가 부족해");
        }
        this.balance -= money;
    }
}
