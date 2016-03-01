/**
 * 
 */
package com.sree.encryption.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author skallem
 *
 */
public class SaltedHashGeneratorUtil {

    public static void main(String[] args) throws Exception {
        String passwordToHash = "34cdc477-e21e-4b57-942c-a3647855d612";
        String salt = SaltGenertaor.getSalt();
        System.out.println("salt : " + salt);
        // String securePassword = getSecurePassword(passwordToHash, salt);
        String securePasswordMD5 = generateMD5(passwordToHash, salt);
        System.out.println("securePassword using MD5 : " + securePasswordMD5);

        String securePasswordSHA1 = generateSHA1(passwordToHash, salt);
        System.out
                .println("securePassword using SHA-1 : " + securePasswordSHA1);

        String securePasswordSHA256 = generateSHA256(passwordToHash, salt);
        System.out.println("securePassword using SHA-256 : "
                + securePasswordSHA256);

        // Regenerate to verify same secured token is geenrated.
        String regeneratedPassowrdToVerifyMD5 = generateMD5(passwordToHash,
                salt);
        System.out.println("regeneratedPassowrdToVerifyMD5 : "
                + regeneratedPassowrdToVerifyMD5);
        String regeneratedPassowrdToVerifySHA1 = generateSHA1(passwordToHash,
                salt);
        System.out.println("securePassword using SHA-1 : "
                + regeneratedPassowrdToVerifySHA1);
        String regeneratedPassowrdToVerifySHA256 = generateSHA256(
                passwordToHash, salt);
        System.out.println("securePassword using SHA-256 : "
                + regeneratedPassowrdToVerifySHA256);
    }

    private static String getSecurePassword(String passwordToHash,
            String hashing, String salt) {
        String generatedPassword = null;
        try {
            // Create MessageDigest instance for MD5
            MessageDigest md = MessageDigest.getInstance(hashing);
            // Add salt bytes to digest
            md.update(salt.getBytes());
            // Get the hash's bytes from password
            byte[] bytes = md.digest(passwordToHash.getBytes());
            // This bytes[] has bytes in decimal format;
            // Convert it to hexadecimal format
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16)
                        .substring(1));
            }
            // Get complete hashed password in hex format
            generatedPassword = sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return generatedPassword;
    }

    public static String generateMD5(String passwordToHash, String salt)
            throws Exception {
        System.out.println("Hash algorithm :  MD5");
        return getSecurePassword(passwordToHash, "MD5", salt);
    }

    public static String generateSHA1(String passwordToHash, String salt)
            throws Exception {
        System.out.println("Hash algorithm :  SHA-1");
        return getSecurePassword(passwordToHash, "SHA-1", salt);
    }

    public static String generateSHA256(String passwordToHash, String salt)
            throws Exception {
        System.out.println("Hash algorithm :  SHA-256");
        return getSecurePassword(passwordToHash, "SHA-256", salt);
    }
}
