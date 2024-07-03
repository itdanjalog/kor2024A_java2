package day09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Step2_DB연동 {
    public static void main(String[] args) {

        try {
            // 1. mysql 라이브러리( Driver 클래스) 호출
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2. DriverManager.getConnection() 메소드를 이용한 DB연동
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java2day09",
                    "root", "1234"
            );
            System.out.println(">> 연동 성공 ");
            // 3 . DML
            // 1. sql 작성한다.
            String sql = "insert into members( name ) values('유재석'); ";
            // 2. prepare(준비)Statement(서명/기재) :
            // conn.prepareStatement( "SQL질의어" )
            // 3. execute(실행) Update(최신화)
            conn.prepareStatement( sql ).executeUpdate();
            System.out.println(">> 유재석을 테이블에 저장했어.");

                // 1. sql 작성한다.
            String sql2 = "select * from members";
                // 2. execute(실행) Query(질의)
                    // 조회한 레코드를 조작할수 있는 인터페이스 반환
            ResultSet rs = conn.prepareStatement( sql2 ).executeQuery();
                // 3.[ResultSet]rs.next() : 다음 레코드로 이동 , 존재하면 true , 없으면 false
            while( rs.next() ){
                // 4. [ResultSet]rs.getString("필드명") : 현재 레코드의 필드 값 호출
                System.out.println( rs.getString("name") );
            }

                // 1. SQL 작성한다.
            String sql3 = "update members set name = '강호동'";
                // 2. prepare(준비)Statement(서명/기재) :
            conn.prepareStatement( sql3 ).executeUpdate();
            System.out.println(">> 유재석을 강호동으로 변경했어.");
            // ---> mysql workbench 에서 select * from members; 코드 실행후 확인

                // 1. SQL 작성한다
            // String sql4 = "delete from members";    // 전체 레코드 삭제
            String sql4 = "delete from members where name = '강호동' ";
                // 2.
            conn.prepareStatement( sql4 ).executeUpdate();
            System.out.println(">>강호동을 삭제했다.");








        }catch ( Exception e ){
            System.out.println(">> 연동 실패 : "+ e);
        }

    } // main end
}
