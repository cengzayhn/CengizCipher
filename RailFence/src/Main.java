import service.RailFenceDecryption;
import service.RailFenceEncryption;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("What should I hide? (Enter an empty line to exit):");
            String textToEncrypt = scanner.nextLine();
            if (textToEncrypt.isEmpty()) {
                break;
            }
            System.out.println("Enter the Encryption key (1 to exit):");
            int encryptionKey = scanner.nextInt();
            if (encryptionKey == 1) {
                break;
            }
            String encryptedText = RailFenceEncryption.encryptRailFence(textToEncrypt, encryptionKey);
            System.out.println("Encrypted Text: " + encryptedText);
            String decryptedText = RailFenceDecryption.decryptRailFence(encryptedText, encryptionKey);
            System.out.println("Decrypted Text: " + decryptedText);

            scanner.nextLine();
        } while (true);
    }
}
