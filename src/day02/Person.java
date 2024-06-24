package day02;

public class Person {

    // 멤버
    // 1. 필드 ( private , public )
    private int money = 100000;
    public String name = "유재석";
    // 2. 생성자
    // 3. 메소드
        //- 관례적인 용어 getter/setter
        // 관례적으로 모든 필드는 private 사용함으로
        // private 필드에 접근하기 위한 저장/호출 하기 위해
        // 해당 필드에 대입해주는 함수 setter
        // 해당 필드에 값 반환 해주는 함수 getter
        // 인텔리제이 자동으로
    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
