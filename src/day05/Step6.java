package day05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Step6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. Map 객체 선언
        Map<String , String > phoneMap = new HashMap<>();
            // <String , String > : 제네릭타입 , map엔트리에 저장할 타입 설정
        while (true){
            System.out.print(" 이름[중복불가] : ");
            String name = scanner.next();
            System.out.print(" 전화번호 : ");
            String phone = scanner.next();
            // 2. Map 객체의 엔트리 저장
            phoneMap.put( name , phone );       System.out.println("phoneMap = " + phoneMap);
            // 3. Map 객체내 모든 엔트리의 정보 출력
            // phoneMap.entrySet().forEach( entry -> { });
            System.out.println("= Map 컬렉션 이용한 전화번호 기록부 = ");
            phoneMap.entrySet().forEach( entry -> {
                System.out.println( entry.getKey() +"\t"+entry.getValue() );
            });
            System.out.println("= =========================== = ");
            /*
            map 컬렉션을 이용한 이름 과 전화번호를 문자열로 입력받아
            사람마다의 이름과 전화번호를 엔트리 구조로 map 저장하시오.
            map 컬렉션을 순회해서 현재 저장된 이름과 전화번호를 전체 출력하시오.
            */
        }
    }
}
