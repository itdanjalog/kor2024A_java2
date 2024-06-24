package day02;

public class Step3 { // class c
    public static void main(String[] args) { // main s
        Account 신한은행통장 = new Account();
        신한은행통장.deposit( 10000 );
        System.out.println( 신한은행통장.getBalance() );
        try {
            신한은행통장.withdraw(20000);
        }catch ( 잔고부족예외 e ){
            System.out.println( e.getMessage());
        }
        System.out.println( 신한은행통장.getBalance() );

    } // main e
} // class e
