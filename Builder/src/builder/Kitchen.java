package builder;

public class Kitchen extends Room {
    private String stove;
    private String sink;

    public Kitchen() {
        this.type = "Kitchen";
    }

    public void setStove(String stove) { this.stove = stove; }
    public void setSink(String sink) { this.sink = sink; }

    @Override
    public String toString() {
        return "Kitchen [stove=" + stove + ", sink=" + sink + "]";
    }
}