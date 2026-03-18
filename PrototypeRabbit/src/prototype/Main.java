package prototype;

public class Main {

    public static void main(String[] args) {

        Person owner = new Person("Cà rốt");

        Rabbit rabbit1 = new Rabbit("Bunny", 2, owner);

        Rabbit rabbit2 = rabbit1.clone();

        System.out.println("Original: " + rabbit1);
        System.out.println("Clone: " + rabbit2);

    }

}