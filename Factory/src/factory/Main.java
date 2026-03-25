package factory;

public class Main {
    public static void main(String[] args) {

        CandyStore store1 = new SimpleCandyStore();
        CandyStore store2 = new VietNamCandyStore();

        store1.orderCandy("chocolate");
        store2.orderCandy("mint");
    }
}