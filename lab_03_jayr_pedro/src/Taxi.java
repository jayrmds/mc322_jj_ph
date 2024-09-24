public class Taxi {
    private String destination;
    private boolean isHailed;

    public Taxi() {
        this.destination = "";
        this.isHailed = false;
    }

    public void hail() {
        this.isHailed = true;
        System.out.println("Taxista atende ao chamado");
    }

    public void setDestination(String destination) {
        this.destination = destination;
        System.out.println("Taxista dirige até o destino: " + destination);
    }
}
