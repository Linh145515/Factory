package prototype;

public class Person implements Cloneable {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public Person clone() {

        try {

            return (Person) super.clone();

        } catch (CloneNotSupportedException e) {

            throw new RuntimeException(e);

        }

    }

    @Override
    public String toString() {

        return name;

    }
}