package Singleton;

public class Main {
    public static void main(String[] args) {

        PrintSpooler p1 = PrintSpooler.getInstance();
        PrintSpooler p2 = PrintSpooler.getInstance();

        p1.print("Document 1");
        p2.print("Document 2");

        // Kiểm tra có cùng instance không
        System.out.println(p1 == p2);
    }
}