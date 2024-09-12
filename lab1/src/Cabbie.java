public class Cabbie {
    private int id;
    private String name;
    private double rating;

    public Cabbie(int id, String name, double rating) {
        this.id = id;
        this.name = name;
        this.rating = rating;
    }

    public void updateRating(double newRating) {
        this.rating = newRating;
    }

    @Override
    public String toString() {
        return "Pessoa motorista " + id + " (" + name + ") criada com sucesso.";
    }
    
    public String getName() {
        return this.name;
    }
}
