package edu.uno.blockchain.function;

import java.security.NoSuchAlgorithmException;

public class Minefunctions {

    private String text= "";

    public String sha256(String text) throws NoSuchAlgorithmException {
        this.text = text;
        Hashfunctions result = new Hashfunctions();
        return result.sha256hash(text);
    }

    public String calculateTransactionHash(String sender, String receiver, String date, String amount)
            throws NoSuchAlgorithmException {
        return sha256(sha256(sender)+sha256(receiver)+sha256(date)+sha256(amount));
    }

    public String calculateBlockHeader(){
        return "somehting";
    }
}
