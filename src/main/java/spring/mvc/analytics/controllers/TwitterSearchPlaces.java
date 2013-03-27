package spring.mvc.analytics.controllers;

import twitter4j.*;
import twitter4j.auth.AccessToken;

public class TwitterSearchPlaces {

	/**
	 * Usage: java twitter4j.examples.geo.SearchPlaces [ip address] or
	 * [latitude] [longitude]
	 * 
	 * @param args
	 *            message
	 */
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
			GeoQuery query;

			query = new GeoQuery(new GeoLocation(
					Double.parseDouble("6.933208392659332"),
					Double.parseDouble("79.84366048810165")));

			ResponseList<Place> places = twitter.searchPlaces(query);
			if (places.size() == 0) {
				System.out
						.println("No location associated with the specified IP address or lat/lang");
			} else {
				for (Place place : places) {
					System.out.println("id: " + place.getId() + " name: "
							+ place.getFullName());
					Place[] containedWithinArray = place.getContainedWithIn();
					if (containedWithinArray != null
							&& containedWithinArray.length != 0) {
						System.out.println("  contained within:");
						for (Place containedWithinPlace : containedWithinArray) {
							System.out.println("  id: "
									+ containedWithinPlace.getId() + " name: "
									+ containedWithinPlace.getFullName());
						}
					}
				}
			}
			System.exit(0);
		} catch (TwitterException te) {
			te.printStackTrace();
			System.out.println("Failed to retrieve places: " + te.getMessage());
			System.exit(-1);
		}
	}
}
