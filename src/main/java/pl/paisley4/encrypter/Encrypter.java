package pl.paisley4.encrypter;

import java.util.Scanner;

public class Encrypter {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type method: ");
        String method = scanner.nextLine();
        if(method.equalsIgnoreCase("encryption")||method.equalsIgnoreCase("e")){
            System.out.println("Type text to encrypt: ");
            String text = scanner.nextLine();
            System.out.println("Your encrypted text: "+EncryptionTool.a(text));
            return;
        }
        if(method.equalsIgnoreCase("decryption")||method.equalsIgnoreCase("d")){
            System.out.println("Type text to decrypt: ");
            String text = scanner.nextLine();
            if(text.length() % 2 != 0){
                System.out.println("Bad text to decrypt!");
                return;
            }
            System.out.println("Your decrypted text: "+EncryptionTool.b(text));
            return;
        }
        System.out.println("Unknown method!");
    }

}
