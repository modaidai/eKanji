package app.bokubake.login.logic;

import app.bokubake.login.bean.Member;

public class LoginLogic {
	/**
	 * ログイン処理を行います.
	 *
	 * @param mailAddress
	 *            メールアドレス
	 * @param password
	 *            パスワード
	 * @return 引数で渡されたメールアドレスやパスワードが一致するメンバーがいればそのメンバー情報を返します.
	 *         一致するメンバーがいなければnullを返します
	 */
	public static Member execute(String userId, String password) throws Exception{

		Member member = MemberInformation.findByMailAddressAndPassword(userId, password);

		return member;
	}
}
