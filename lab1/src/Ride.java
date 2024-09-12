import java.util.Random;

public class Ride {
    private Passenger passenger;
    private Cabbie cabbie;
    private String startLocation;
    private String endLocation;
    private double fare;

    public Ride(Passenger passenger, Cabbie cabbie, String startLocation, String endLocation) {
        this.passenger = passenger;
        this.cabbie = cabbie;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.fare = calculateFare();
    }

    private double calculateFare() {
        Random rand = new Random();
        return rand.nextInt(300) + 50; // Gerando um valor entre 50 e 350
    }

    @Override
    public String toString() {
        return "Corrida chamada por pessoa passageira " + passenger.getName() + " de " + startLocation + " para " + endLocation + ".\n" +
               "Corrida atendida por pessoa motorista " + cabbie.getName() + ".\n" +
               "Valor da corrida definido: R$" + fare;
    }
}
