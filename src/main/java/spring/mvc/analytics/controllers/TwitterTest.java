package spring.mvc.analytics.controllers;

import java.util.List;

import twitter4j.*;
import twitter4j.auth.AccessToken;

public class TwitterTest {
	public static void main(String[] args) {

		try {
			Twitter twitter = new TwitterFactory().getInstance();
			twitter.setOAuthConsumer("LsF92vmm2nkyuZZ3OYL7kA",
					"Dqi6e19wZqOp76D3JGw6UXYxDC829C7c6CJ2XzMaa4");
			String accessToken = "330762865-hJvnkkODdgi6bsrxHgcZqiitKNNVbYIVA46bBfXr";
			String accessTokenSecret = "UqY7TY0bVLeYguywTMwcdMkXuMgy2dbFE9TRg4f5ns";
			AccessToken oathAccessToken = new AccessToken(accessToken,
					accessTokenSecret);
			twitter.setOAuthAccessToken(oathAccessToken);

			Query query = new Query("cocovarenda");
			QueryResult result;
			do {
				result = twitter.search(query);
				List<Status> tweets = result.getTweets();
				if(tweets.size()==0)
					System.out.println("0 tweets returned ");
				for (Status tweet : tweets) {
					System.out.println("@" + tweet.getUser().getScreenName()
							+ " - " + tweet.getText());
				}
			} while ((query = result.nextQuery()) != null);
			System.exit(0);
		} catch (TwitterException te) {
			te.printStackTrace();
			System.out.println("Failed to search tweets: " + te.getMessage());
			System.exit(-1);
		}

	}

}
