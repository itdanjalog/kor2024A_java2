package day03;

import java.util.ArrayList;
import java.util.List;

public class Step1 {
    public static void main(String[] args) {

        // 상황극 : 제품(제품번호 , 제품명, 가격 ) 3개 관리하는 프로그램
            // --> 장사가 잘되면 제품 개수는 무한히 많아질수도 있음.

        // [1] 변수 활용 : 변수에는 1개의 자료/데이터 만 저장
            // 제품 1개당 변수는 3개 필요. 제품3개이면 변수9개 , 제품100개이면 변수 300개
        int no1 = 1; String name1 = "사이다"; int price1 = 3000;
        int no2 = 2; String name2 = "콜라"; int price2 = 2000;
        int no3 = 3; String name3 = "환타"; int price3 = 1000;

        // [2] 배열 활용 : 배열에는 여러개의 동일한 타입 자료/데이터 저장
            // - 제품의 속성마다 배열 할당 , 제품의 속성이 3개이면 배열3개 , 제품100이면 배열3개
        int[] noArray = { 1 , 2 , 3 };
        String[] nameArray = { "사이다" , "콜라" , "환타" };
        int[] priceArray = { 300,200,100 };

        // [3] 객체와 배열의 활용
        Product p1 = new Product( 1 , "사이다",3000);
        Product p2 = new Product( 2 , "콜라",2000);
        Product p3 = new Product( 3 , "환타",1000);
        Product[] productArray = { p1 , p2 , p3 };

        // [4] step3 이후 에 작성한 코드 :
        List< Product > productList1 = new ArrayList<>();
        productList1.add( new Product( 1 , "사이다",3000)  );
        productList1.add( new Product( 2 , "콜라",2000)  );
        productList1.add( new Product( 3 , "환타",1000)  );

    }
}
