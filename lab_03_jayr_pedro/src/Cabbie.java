public class Cabbie {
    private String id;
    private String name;
    private float rate;

    // Construtor
    public Cabbie(String id, String name, float rate) {
        this.id = id;
        this.name = name;
        this.rate = rate;
    }

    // Métodos getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getRate() {
        return rate;
    }
}
