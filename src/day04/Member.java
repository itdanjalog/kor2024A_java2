package day04;

public class Member {
    static int code;    // static변수 // 모든 객체가 같이 사용하는 변수
    String gender;      // 멤버변수 // 각 객체마다 사용하는 변수

    public Member(){}
    public Member( String gender ){
        this.gender = "dd";
    }
}
