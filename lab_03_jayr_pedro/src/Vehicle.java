public class Vehicle {
    private int id;
    private String model;
    //private String cabbieId;

    public Vehicle(int id, String model) {
        this.id = id;
        this.model = model;
    }

    //public void updateCabbieId(String newCabbieId) {
        //this.cabbieId = newCabbieId;
    //}

    @Override
    public String toString() {
        return "Veículo " + id + " (" + model + ") criado com sucesso.";
    }

    public Integer getId() {
        return this.id;
    }
}
