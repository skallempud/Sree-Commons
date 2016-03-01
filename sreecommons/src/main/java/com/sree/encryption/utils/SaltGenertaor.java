/**
 * 
 */
package com.sree.encryption.utils;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;

/**
 * @author skallem
 *
 */
public class SaltGenertaor {

    public static String getSalt() throws NoSuchAlgorithmException,
            NoSuchProviderException {
        // Always use a SecureRandom generator
        SecureRandom sr = SecureRandom.getInstance("SHA1PRNG", "SUN");
        // Create array for salt
        byte[] salt = new byte[16];
        // Get a random salt
        sr.nextBytes(salt);
        // return salt
        return salt.toString();
    }
}
