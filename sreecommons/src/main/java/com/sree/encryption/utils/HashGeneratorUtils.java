/**
 * 
 */
package com.sree.encryption.utils;

import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;

/**
 * @author skallem
 *
 */
public class HashGeneratorUtils {

    public static String generateMD5(File file) throws Exception {
        return hashFile(file, "MD5");
    }

    public static String generateSHA1(File file) throws Exception {
        return hashFile(file, "SHA-1");
    }

    public static String generateSHA256(File file) throws Exception {
        return hashFile(file, "SHA-256");
    }

    private static String hashFile(File file, String algorithm)
            throws Exception {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
            MessageDigest digest = MessageDigest.getInstance(algorithm);

            byte[] bytesBuffer = new byte[1024];
            int bytesRead = -1;

            while ((bytesRead = inputStream.read(bytesBuffer)) != -1) {
                digest.update(bytesBuffer, 0, bytesRead);
            }

            byte[] hashedBytes = digest.digest();

            return convertByteArrayToHexString(hashedBytes);
        } catch (Exception ex) {
            throw new Exception("Could not generate hash from file :", ex);
        }
    }

    private static String convertByteArrayToHexString(byte[] arrayBytes) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < arrayBytes.length; i++) {
            stringBuffer.append(Integer.toString(
                    (arrayBytes[i] & 0xff) + 0x100, 16).substring(1));
        }
        return stringBuffer.toString();
    }
}
