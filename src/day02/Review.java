package day02;

public class Review {
    public static void main(String[] args) {

    /*
    데이터 : 리터럴( 개발자가 직접 입력한 순수 값 )
            - 3 , 'a' , 3.14 , true , false

    데이터 타입/형식 : 기본자료형/타입 7개
    기본타입 : 리터럴 참조
        boolean , char , byte , short , int , long , float , double

    참조타입 : 객체를 참조
        클래스 , 배열 , 인터페이스 , 열거타입
    */
        boolean _boolean = true;
        char _char = 'a';
        byte _byte = 123;
        short _short = 30000;
        int _int = 200000000;
        long _long = 2000000000000L;
        float _float = 3.123456789123456789F;
        double _double = 3.123456789123456789;

        // int 3개 저장할래 : 배열  -> int[] array = new int[3];
        int[] array = new int[3];
        array[0] = 1; array[1] = 2; array[2] = 3;

        // vs
        ThreeInt threeInt = new ThreeInt();
        threeInt._0 = 1 ;
        threeInt._1 = 2 ;
        threeInt._2 = 3 ;

        // int 랑 double 랑 char 각 3개를 저장할래 --> 3개를 저장할수 있는 타입은 없는데
        TotalType totalType = new TotalType();
        totalType.a = 2000000;
        totalType.b = 3.14;
        totalType.c = 'a';




    }
}
