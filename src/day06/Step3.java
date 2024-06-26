package day06;

import java.util.Scanner;
import java.util.TreeMap;

public class Step3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        TreeMap< String , Integer > products = new TreeMap<>();

        while (true){
            System.out.print("1.등록 2.출력 : ");
            int ch = scan.nextInt();
            if( ch == 1 ){
                String name = scan.next();
                int price = scan.nextInt();
                products.put( name , price );
            }
            else if( ch == 2 ){
                products.entrySet().forEach( entry -> {
                    System.out.print(" 제품명 = " + entry.getKey() );
                    System.out.print(" 제품가 = " + entry.getValue() );
                    System.out.println();
                });
            }
        }
            /*
            TreeMap 컬렉션 이용한 제품 관리
                [1] 제품명 과 가격을 입력받아 TreeMap 저장
                [2] 제품명 기준의 오름차순으로 정렬하여 제품명과 가격을 모두 출력하시오.
            */
    }
}
