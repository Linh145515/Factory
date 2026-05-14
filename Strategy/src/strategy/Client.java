package strategy;

public class Client {

    public static void main(String[] args) {

        EncryptionContext context = new EncryptionContext();

        // AES
        context.setStrategy(new AESEncryption());
        context.encryptData("Hello AES");

        System.out.println();

        // DES
        context.setStrategy(new DESEncryption());
        context.encryptData("Hello DES");

        System.out.println();

        // RSA
        context.setStrategy(new RSAEncryption());
        context.encryptData("Hello RSA");
    }
}