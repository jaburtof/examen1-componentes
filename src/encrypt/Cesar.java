package encrypt;
import java.util.*;

public class Cesar implements Encrypt {
    public static final String alpha = "abcdefghijklmnopqrstuvwxyz";
    @Override
    public void encrypt(String toEncrypt) {
        Scanner sc = new Scanner(System.in);
        toEncrypt = "";
        int key = 0;
        System.out.println("Welcome to Cesar Cipher Method, Componentes 2022\n");
        System.out.println("Enter a word that you want to encrypt:");
        toEncrypt = sc.next();

        System.out.println("\nEnter a value for Cesar Key's cipher:");
        key = sc.nextInt();

        System.out.println("\nEncrpyted word with Cesar: " + CesarCipher(toEncrypt, key));
    }

    public static String CesarCipher(String message, int shiftKey) {
        message = message.toLowerCase();
        String cipherText = "";
        for (int i = 0; i < message.length(); i++) {
            int charPosition = alpha.indexOf(message.charAt(i));
            int keyVal = (shiftKey + charPosition) % 26;
            char replaceVal = alpha.charAt(keyVal);
            cipherText += replaceVal;
        }
        return cipherText;
    }
}
