public class Passenger extends Person {
    private String destination;
    private String name;

    public Passenger(String name) {
        this.destination = "";
        this.name = name;
    }

    @Override
    public void performRole() {
        System.out.println(name + " define o destino (" + destination + ")");
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getName() {
        return this.name;
    }
}
