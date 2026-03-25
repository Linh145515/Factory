package builder;

public class Bedroom extends Room {
    private String bed;
    private String color;
    private int size;

    public Bedroom() {
        this.type = "Bedroom";
    }

    public void setBed(String bed) { this.bed = bed; }
    public void setColor(String color) { this.color = color; }
    public void setSize(int size) { this.size = size; }

    @Override
    public String toString() {
        return "Bedroom [bed=" + bed + ", color=" + color + ", size=" + size + "]";
    }
}