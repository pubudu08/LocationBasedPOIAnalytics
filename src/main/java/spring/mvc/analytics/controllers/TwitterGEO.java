package spring.mvc.analytics.controllers;

import twitter4j.*;
import twitter4j.auth.AccessToken;

public class TwitterGEO {
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
			Place place = twitter.getGeoDetails("df51dec6f4ee2b2c");
			System.out.println("name: " + place.getName());
			System.out.println("country: " + place.getCountry());
			System.out.println("country code: " + place.getCountryCode());
			System.out.println("full name: " + place.getFullName());
			System.out.println("id: " + place.getId());
			System.out.println("place type: " + place.getPlaceType());
			System.out.println("street address: " + place.getStreetAddress());
			Place[] containedWithinArray = place.getContainedWithIn();
			if (containedWithinArray != null
					&& containedWithinArray.length != 0) {
				System.out.println("  contained within:");
				for (Place containedWithinPlace : containedWithinArray) {
					System.out.println("  id: " + containedWithinPlace.getId()
							+ " name: " + containedWithinPlace.getFullName());
				}
			}
			System.exit(0);
		} catch (TwitterException te) {
			te.printStackTrace();
			System.out.println("Failed to retrieve geo details: "
					+ te.getMessage());
			System.exit(-1);
		}
	}

}
