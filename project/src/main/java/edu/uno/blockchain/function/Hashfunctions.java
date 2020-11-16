package edu.UNO.blockChain.function;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/**
 * The class of hash function.
 * @author fire-holder
 *
 */
public class Hashfunctions {
	/**
	 * Hashing with sha-356.
	 * @param text The text to be hashed. 
	 * @return The encrypted string.
	 * @throws NoSuchAlgorithmException
	 */
    public static String sha256hash(String text) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(text.getBytes());
        byte[] digest = md.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : digest) {
            sb.append(String.format("%02x", b & 0xff));
        }
        return sb.toString();
    }
    /**
     * Hashing with MD5.
     * @param text The text to be hashed. 
     * @return The encrypted string.
     * @throws NoSuchAlgorithmException
     */
    public String md5hash(String text) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(text.getBytes());
        byte[] digest = md.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : digest) {
            sb.append(String.format("%02x", b & 0xff));
        }
        return sb.toString();
    }
}