package edu.uno.blockchain.function;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hashfunctions {
    public String hash(String text) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(text.getBytes());
        byte[] digest = md.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : digest){
            sb.append(String.format("%02x", b & 0xff));
        }
        return sb.toString();
    }
}