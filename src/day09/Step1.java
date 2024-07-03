package day09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class Step1 {
    public static void main(String[] args) {
        // JAVA 에서 사용하는 변수는 1.지역변수 2.멤버변수 3.static변수 는 프로그램이 종료되면 초기화/사라짐
            // - 데이터베이스 연동해서 데이터베이스에 데이터를 저장하자 , 프로그램이 종료되도 데이터는 사라지지 않는다.
        // ---------- 1.DB 연동 코드 작성 , 예외처리 : Step2 참고  --------- //
        Connection conn = null; // Connection인터페이스 변수 선언
        try {  // 1-0 예외처리
            // 1-1 해당 jdbc 클래스 호출
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 1-2 DB SERVER 연동 ( url , 계정 , 비밀번호 )
            conn = DriverManager.getConnection("jdbc://localhost:3306/java2day09", "root", "1234");
        }catch ( Exception e ){  System.out.println(e); }
        // ------------------------------------- //
        Scanner scan = new Scanner(System.in);
        while (true){   // 무한루프
            System.out.print("1.create 2.select 3.update 4.delete : ");
            int ch = scan.nextInt();
            if( ch == 1 ){
                // [INSERT] 하나의 이름을 입력받아서 입력받은 이름을 데이터베이스 members 테이블에 저장하시오.
                try { // 일반 예외
                    System.out.print("[C] new Name : ");        String name = scan.next(); // 1. 이름을 입력받기
                    String sql = "insert into members( name ) values('" + name + "')"; // 2. "insert into members( name ) values('유재석')";
                    conn.prepareStatement(sql).executeUpdate(); // 3. SQL 기재하고 실행
                }catch (Exception e ){ System.out.println(e); }
            }
            else if( ch == 2 ){
                // [Select] 현재 데이터베이스 members 테이블에 저장된 name을 모두 출력하시오.
                try {
                    String sql = "select * from members"; // 1. SQL 작성하기
                    ResultSet rs = conn.prepareStatement(sql).executeQuery(); // 2. SQL 기재하고 실행후 결과를 조작하는 인터페이스 반환
                    // 3. 조회 결과를 반복문을 통해 하나씩 줄/행/레코드 호출하기
                    while (rs.next()) {     // 4. (ResultSet)rs.next() : 다음 레코드로 이동 , 존재하면 true , 없으면 false 반환
                        // 5. (ResultSet)rs.getString("필드명") : 현재 레코드의 해당 필드명의 값 호출
                        System.out.print(rs.getString("name"));
                    }   System.out.println();
                }catch (Exception e ){ System.out.println(e); }
            }
            else if( ch == 3 ){
                // [Update] 수정할 기존 이름 과 수정할 새로운 이름을 각 입력받아서 수정할 이름을 새로운이름으로 members 테이블 값을 수정 하시오.
                try {
                    System.out.print("[U] 수정할 기존 이름 : ");   String oldName = scan.next();
                    System.out.print("[U] 수정할 새로운 이름 : ");  String newName = scan.next();
                    // 2. sql 작성 하기 // String sql = "update members set name = '강호동' where name = '유재석'";
                    String sql = "update members set name = '" + newName + "' where name = '" + oldName + "'";
                    // 3. sql 기재하고 실행
                    conn.prepareStatement(sql).executeUpdate();
                }catch (Exception e ){  System.out.println( e );  }
            }
            else if( ch == 4 ){
                // [Delete] 삭제할 이름 을 입력받아서 해당 이름을 members 테이블 에서 삭제 하시오.
                try {
                    //1. 입력받기
                    System.out.print("[D] 삭제할 이름 : "); String name = scan.next();
                    // 2. sql 작성
                    String sql = "delete from members where name = '" + name + "' ";
                    // 3. sql 기재하고 실행
                    conn.prepareStatement(sql).executeUpdate();
                }catch ( Exception e ){   System.out.println( e );   }
            }
        } // w end
    } // main end
} // class end











