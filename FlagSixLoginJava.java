import javax.crypto.*;
import javax.crypto.spec.DESKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Base64;

public class FlagSixLoginJava {
    private static final byte[] f1472a = h.b();
    private static final byte[] f1473b = h.a();

    public static String decryptFlag(String encodedFlag, byte[] key) {
        try {
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
            SecretKey generateSecret = keyFactory.generateSecret(new SecretKeySpec(key, "DES"));
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(Cipher.DECRYPT_MODE, generateSecret);
            byte[] decodedBytes = cipher.doFinal(Base64.getDecoder().decode(encodedFlag));
            return new String(decodedBytes);
        } catch (InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            e.printStackTrace();
        }
        return "Decryption failed"; // Return a message indicating decryption failure
    }

    public static void main(String[] args) {
        // Replace 'inputFlag' with your encoded flag
        String inputFlag = "k3FElEG9lnoWbOateGhj5pX6QsXRNJKh///8Jxi8KXW7iDpk2xRxhQ==";
        
        // Decrypt the input flag using the appropriate keys (f1472a and f1473b)
        String decryptedFlagA = decryptFlag(inputFlag, f1472a);
        String decryptedFlagB = decryptFlag(inputFlag, f1473b);
        
        // Output both decrypted flags
        System.out.println("Decrypted Flag (Key A): " + decryptedFlagA);
        System.out.println("Decrypted Flag (Key B): " + decryptedFlagB);
    }
}

