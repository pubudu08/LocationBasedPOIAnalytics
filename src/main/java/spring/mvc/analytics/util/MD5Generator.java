package spring.mvc.analytics.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

public class MD5Generator {

    public String generate(String password){
        StringBuffer hexString = new StringBuffer();
        if (password == null || password.length() == 0) {
            throw new IllegalArgumentException("password to encrypt cannot be null or zero length");
        }

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            byte[] hash = md.digest();
            int i = 0;
            while (i < hash.length) {
                if ((0xff & hash[i]) < 0x10) {
                    hexString.append("0" + Integer.toHexString((0xFF & hash[i])));
                }
                else {
                    hexString.append(Integer.toHexString(0xFF & hash[i]));
                }
                i += 1;
            }

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return hexString.toString();
    }

}
