package app.bokubake.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import app.bokubake.login.bean.Member;
import app.bokubake.login.logic.LoginLogic;

/**
 * Servlet implementation class UserLoginServlet
 */
@WebServlet("/UserLogin")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// リクエストパラメータを取得します
		String userId = request.getParameter("userId");
		String password = request.getParameter("passwd");

		// ログイン処理を行います
		Member member;
		try {
			member = LoginLogic.execute(userId, password);
		} catch (Exception e) {
			throw new ServletException(e);
		}

		// ログインに失敗したらエラーメッセージをリクエストスコープに入れて
		// ログイン画面に戻ります
		if (member == null) {
			request.setAttribute("errorMessage", "メールアドレスかパスワードが違います");
			RequestDispatcher rd = request
					.getRequestDispatcher("/ViewLoginServlet");
			rd.forward(request, response);
			return;
		}

		// ログインが成功した場合は
		// メンバー情報をセッションスコープに格納します
		// 最後にTweet一覧を表示するサーブレットへフォワードします
		HttpSession session = request.getSession();
		session.setAttribute("member", member);

		RequestDispatcher rd = request
				.getRequestDispatcher("/view/list.jsp");
		rd.forward(request, response);
	}

}
