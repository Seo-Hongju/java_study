package ex18jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertSQL {

	//멤버변수
	Connection con; //DB연결을 위한 객체 
	Statement stmt; //쿼리전송 및 실행을 위한 객체

	//생성자 : DB연결을 처리함
	public InsertSQL() {
		 try {
			//1.오라클 드라이버 로드
			Class.forName("oracle.jdbc.OracleDriver");
			//2.커넥션 객체를 통해 연결을 처리
			con = DriverManager.getConnection(
				"jdbc:oracle:thin://@localhost:1521:orcl",
				"korea",
				"1234");
			System.out.println("오라클 DB 연결성공");
		 }
		 catch (ClassNotFoundException e) {
			 System.out.println("오라클 드라이버 로딩 실패");
			 e.printStackTrace();
		 }
		 catch (SQLException e) {
			 System.out.println("DB 연결 실패");
			 e.printStackTrace();
		 }
		 catch (Exception e) {
			 System.out.println("알수 없는 예외발생");
		 }
	}//end of InsertSQL	
 
	//실제 쿼리작성 및 실행을 위한 메소드
	private void execute()	{
		try {
			//3.Statement 계열의 객체를 생성하여 쿼리실행준비
			stmt = con.createStatement();
			
			//4.insert쿼리 작성
			String sql = "INSERT INTO member VALUES "
				+ " ('test3','3333','삼길동',SYSDATE)";
						
			//5.쿼리실행 및 반환값 받기
			int affected = stmt.executeUpdate(sql);
			System.out.println(affected +"행이 입력되었습니다.");
		}
		catch(SQLException e) {
			System.out.println("쿼리실행에 문제가 발생하였습니다.");
			e.printStackTrace();
		}
		finally {
			//6.연결된 자원 반납
			close();
		}
	}//end of execute
	
	//자원반납을 위한 메소드
	private void close() {
		try {
			if(stmt!=null) stmt.close(); 
			if(con!=null) con.close(); 
			System.out.println("DB자원반납완료");
		}
		catch(SQLException e) {
			System.out.println("자원반납시 오류가 발생하였습니다.");
		}
	}//end of close

	public static void main(String[] args) {
		
		//실행방법1 : 참조변수없이 객체생성과 동시에 메소드호출
		//new InsertSQL().execute();
		
		//실행방법2 : 객체생성후 참조변수에 대입후 메소드호출
		InsertSQL insertSQL = new InsertSQL();
		insertSQL.execute();
		
	}//end of main
}





