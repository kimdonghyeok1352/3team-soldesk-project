import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class oracle {

	public static void main(String[] args) throws SQLException {
		Connection conn = null; // DB와 연결하는 인터페이스
		PreparedStatement pstm = null; // sql문 객체
		ResultSet r = null;// sql에 대한 반환

		try {
			String que = "select * from emp";
			conn = db.get();
			pstm = conn.prepareStatement(que);
			r = pstm.executeQuery();
			while (r.next()) {
				String empno = r.getString(1);
				String ename = r.getString(2);
				String job = r.getString(3);
				int mgr = r.getInt(4);
			
				System.out.println(empno + " " + job + " " + ename + " " + mgr);
			}
		} catch (SQLException e) {
			System.out.println("예외발생");
			e.printStackTrace();
		}
		r.close();
		pstm.close();
		conn.close();

	}

}