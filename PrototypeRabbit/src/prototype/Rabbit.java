package prototype;

public class Rabbit implements RabbitPrototype, Cloneable {

    private String name;
    private int age;
    private Person owner;

    public Rabbit(String name, int age, Person owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    @Override
    public Rabbit clone() {

        try {

            Rabbit cloned = (Rabbit) super.clone();

            // deep copy owner
            cloned.owner = owner.clone();

            return cloned;

        } catch (CloneNotSupportedException e) {

            throw new RuntimeException(e);

        }

    }

    @Override
    public String toString() {

        return "Rabbit{name='" + name + "', age=" + age +
                ", owner=" + owner + "}";

    }
}