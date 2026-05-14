package strategy;

public class EncryptionContext {

    private EncryptionStrategy strategy;

    // set strategy
    public void setStrategy(EncryptionStrategy strategy) {
        this.strategy = strategy;
    }

    // thực hiện mã hóa
    public void encryptData(String text) {

        if (strategy == null) {
            System.out.println("No encryption strategy selected!");
            return;
        }

        strategy.encrypt(text);
    }
}