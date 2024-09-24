public class Passenger extends Person {
    private int id;
    private String destination;
    private String name;
    private String phone;

    public Passenger(int id, String name) {
        this.id = id;
        this.destination = "";
        this.name = name;
        this.phone = phone;
    }

    @Override
    public void performRole() {
        System.out.println(name + " define o destino (" + destination + ")");
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void updatePhone(String newPhone) {
        this.phone = newPhone;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getName() {
        return this.name;
    }
    public Integer getId() {
        return this.id;
    }
}
