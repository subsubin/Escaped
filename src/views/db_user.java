package views;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class db_user {
	// https://bitbucket.org/xerial/sqlite-jdbc/src/default/#markdown-header-usage
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.sqlite.JDBC");
		Connection connection = DriverManager.getConnection("jdbc:sqlite:sample.db");

		PreparedStatement ps = connection.prepareStatement("INSERT INTO test_table VALUES(?, ?)");
		ps.setString(1, index.username);
		ps.setInt(2, index.time);

		int res = ps.executeUpdate();

		if (res == 1)
			System.out.println("성공");

		ps.close();

		connection.close();
		// 망했다~~~~~~~~ㅇ럼이;ㅗㅎㅁ 혀ㅑㅐㄷ;ㅓㄴ리ㅏ먼아ㅇㅁㅎ/ 갈화씨바리ㅏㅁ어ㅏㅣㄹ
	}
}