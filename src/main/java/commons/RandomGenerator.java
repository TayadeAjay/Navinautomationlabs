package commons;

import java.util.Random;

public class RandomGenerator {

	public static String generateRandomEmail() {
		Random rand = new Random();
		int randomNum = rand.nextInt(10000);
		String email = "test" + randomNum + "@gmail.com";
		return email;
	}

	public static String generateRandomMobile() {
		Random rand = new Random();
		long randomNum = (long) (Math.random() * (9999999999L - 1000000000L)) + 1000000000L;
		String mobile = "9" + randomNum;
		return mobile;
	}

}
