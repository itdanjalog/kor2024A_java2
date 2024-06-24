package day02;

public class Test {

    public static void main(String[] args) {

       Person p = new Person();

       // 객체내 필드의 값 호출
        System.out.println( p.name );
        System.out.println( p.getMoney() );
        // 객체내 필드의 값 수정
        p.name = "강호동";
        p.setMoney( 2000 );

    }
}
