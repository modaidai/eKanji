package app.bokubake.login.logic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import app.bokubake.common.DBManager;
import app.bokubake.login.bean.Member;

public class MemberInformation {


	public static Member findByMailAddressAndPassword(String userId, String passwd) throws Exception {
		String sql = "SELECT id" +
				     "     , user_id" +
				     "     , password" +
				     "     , user_name" +
				     "     , twitter_id" +
				     "     , my_photo_path" +
				     "  FROM bokubake.users" +
				     " WHERE user_id = ?" +
				     "   AND password = ?";

		Connection conn = DBManager.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);

		pstmt.setString(1, userId);
		pstmt.setString(2, passwd);

		ResultSet rs = pstmt.executeQuery();

		Member member = new Member();
		while (rs.next()) {
			member.setId(rs.getBigDecimal("id"));
			member.setUserId(rs.getString("user_id"));
			member.setPassWord(rs.getString("password"));
			member.setUserName(rs.getString("user_name"));
			member.setTwitterId(rs.getString("twitter_id"));
			member.setMyPhotoPath(rs.getString("my_photo_path"));
		}

		return member;
	}
}
