package Singleton;

public class PrintSpooler {

    // Tạo biến instance 
    private static PrintSpooler instance;

    // Constructor private (không cho new)
    private PrintSpooler() {
        init();
    }

    // Hàm init (giả lập khởi tạo phức tạp)
    private void init() {
        System.out.println("PrintSpooler initialized...");
    }

    // Hàm lấy instance duy nhất
    public static PrintSpooler getInstance() {
        if (instance == null) {
            instance = new PrintSpooler();
        }
        return instance;
    }

    // Demo chức năng
    public void print(String doc) {
        System.out.println("Printing: " + doc);
    }
}