package app.bokubake.common;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class TestTweetList {

	/**
	 * @param args
	 * @throws TwitterException
	 */
	public static void main(String[] args) throws TwitterException {
		// 初期化
		Twitter twitter = new TwitterFactory().getInstance();
		Query query = new Query();

		// 検索ワードをセット（試しにバルスを検索）
		query.setQuery("バルス");

		// 検索実行
		QueryResult result = twitter.search(query);

		System.out.println("ヒット数 : " + result.getTweets().size());

		for (Status status : result.getTweets()) {
			// 本文
			System.out.println(status.getText());
			// 発言したユーザ
			System.out.println(status.getUser());
			// 発言した日時
			System.out.println(status.getCreatedAt());
			// 他、取れる値はJavaDoc参照
			// http://twitter4j.org/ja/javadoc/twitter4j/Tweet.html
		}

	}

}
