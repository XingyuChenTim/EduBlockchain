package edu.UNO.blockChain.function;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
/**
 * 
 * @author fire-holder
 *
 */
class StringUtil {
	/**
	 * 
	 */
	private StringUtil() {
		throw new IllegalStateException("Utility class");
	  }
	/**
	 * 
	 * @param input
	 * @return
	 */
	public static String applySha256(String input) {
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			byte[] hash = digest.digest(input.getBytes(StandardCharsets.UTF_8));
			StringBuilder hexString = new StringBuilder();
			for (int i = 0; i < hash.length; i++) {
				String hex = Integer.toHexString(0xff & hash[i]);
				if (hex.length() == 1)
					hexString.append('0');
				hexString.append(hex);
			}
			return hexString.toString();
		} catch (Exception e) {
			throw new RuntimeException("The sha256 is not working");
		}
	}
	/**
	 * 
	 * @param difficulty
	 * @return
	 */
	public static String getDificultyString(int difficulty) {
		return new String(new char[difficulty]).replace('\0', '0');
	}
}
