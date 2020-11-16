package edu.UNO.blockChain.function;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
/**
 * The class of string utility. 
 * @author fire-holder
 *
 */
class StringUtil {
	/**
	 * Default constructor. 
	 */
	private StringUtil() {
		throw new IllegalStateException("Utility class");
	  }
	/**
	 * To apply the sha 256 on input string.
	 * @param input The string to be applied.
	 * @return The string that are applied with sha 256.
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
	 * Get difficulty string.
	 * @param difficulty The int of difficulty.
	 * @return The difficulty string.
	 */
	public static String getDificultyString(int difficulty) {
		return new String(new char[difficulty]).replace('\0', '0');
	}
}
