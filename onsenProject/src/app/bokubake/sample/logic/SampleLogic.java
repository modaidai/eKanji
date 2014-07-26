package app.bokubake.sample.logic;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import app.bokubake.common.DBManager;
import app.bokubake.sample.SampleConst;
import app.bokubake.sample.bean.TestHelloDTO;


public class SampleLogic {

	public void execute(HttpServletRequest req) throws Exception{
		List<TestHelloDTO> resultList = this.getTestHelloDB();

		req.setAttribute(SampleConst.SAMPLE_ATTRIBUTE_TITLE_LIST, resultList);
	}

	private List<TestHelloDTO> getTestHelloDB() throws Exception {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = DBManager.getConnection();

			String sql = "SELECT ID, TITLE FROM summer.TEST_HELLO";

			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			List<TestHelloDTO> list = new ArrayList<TestHelloDTO>();

			while (rs.next()) {
				TestHelloDTO dto = new TestHelloDTO();
				dto.setTitle(rs.getString("TITLE"));
				dto.setId(rs.getBigDecimal("ID"));
				list.add(dto);
			}

			return list;
		} catch (Exception e) {
			throw e;
		} finally {
			if (rs != null) rs.close();
			if (stmt != null) stmt.close();
			if (conn != null) conn.close();
		}
	}

}
