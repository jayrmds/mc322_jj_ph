public class Passenger extends Person {
    private int id;
    private String name;
    private Location startLocation;
    private Location destination;

    public Passenger(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void performRole() {
        System.out.println(name + " define o destino (" + destination + ")");
    }

    public void setStartLocation(Location startLocation) {
        this.startLocation = startLocation;
    }

    public void setDestination(Location destination) {
        this.destination = destination;
    }

    public Location getStartLocation() {
        return startLocation;
    }

    public Location getDestination() {
        return destination;
    }

    public String getName() {
        return this.name;
    }

    public Integer getId() {
        return this.id;
    }
}
