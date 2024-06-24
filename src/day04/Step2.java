package day04;

import java.util.Scanner;
/*
    [실습1]
        1. Product 객체가 여러개 저장되는 하나의 배열 선언
        2. 선언된 배열은 Product 객체가 N개 ( 무한정 ) 저장될수 있도록 가변길이로 구현합니다.
        3. Product 객체내에는 제품명 과 제품가격이 저장될수 멤버변수를 구성 합니다.
        4. [ 기능 ]
               1. ADD : 제품명 과 제품가격 을 입력받아 product객체 생성후 배열에 저장 처리
               2. List : 배열내 저장된 product객체의 멤버변수를 모두 출력 처리
               3. Delete : 삭제할 제품명을 입력받아 배열내 동일한 제품명이 존재하면 배열내 삭제 처리
 */
public class Step2 {
    public static void main(String[] args) {
        // 2. 입력객체
        Scanner scanner = new Scanner(System.in);
        // * 배열
        int length = 0;
        Product[] productArray = new Product[ length ]; // 처음에는 인덱스가 없다 .
        // 1. 무한반복
        while (true){
            System.out.print("1.productADD 2.productList 3.productDelete 선택]"); // 출력문
            int ch = scanner.nextInt(); // 입력 받은 값을 변수에 저장
            if( ch ==1 ){
                // 1. 입력 받은 값을 변수에 저장
                System.out.println(">> add ProductName : ");
                String name = scanner.next();
                System.out.println(">> add ProductPrice : ");
                int price = scanner.nextInt();
                // 2. 객체 생성
                Product product = new Product();
                product.name = name; product.price = price; // - 객체 안에 있는 멤버변수에 입력받은 값 넣어주기
                // 3. 배열 저장
                length++;
                Product[] newProductArray = new Product[ length ];
                // 기존 배열에 있는 값을 새로운 배열에 카피/복사/이동
                for( int i = 0 ; i < productArray.length ; i++ ){
                    newProductArray[i] = productArray[i];
                }
                // 4. 새로운 배열내 마지막 인덱스에 생성된 객체 대입  ( 마지막인덱스 : 배열명.length-1 )
                newProductArray[newProductArray.length-1 ] = product;
                // 5. 새로운 배열 을 기존 배열에 대입
                productArray = newProductArray;

            }
            else if( ch== 2 ){}
            else if( ch == 3 ){}
        } // w end
    } // main end
} // class end
