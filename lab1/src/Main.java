import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Cadastro de um passageiro
        Passenger passenger = new Passenger(92, "Ana", "11999999999");
        System.out.println(passenger);
        passenger.updatePhone("11888888888");
        System.out.println("Campo \"phone\" atualizado para pessoa passageira 92.");

        // Cadastro de um taxista
        Cabbie cabbie = new Cabbie(133, "Julio", 4.8);
        System.out.println(cabbie);
        cabbie.updateRating(5.0);
        System.out.println("Campo \"rating\" atualizado para pessoa motorista 133.");

        // Cadastro de um veículo
        Vehicle vehicle = new Vehicle(235, "Ford ABC123");
        System.out.println(vehicle);
        vehicle.updateCabbieId("133");
        System.out.println("Campo \"cabbieId\" atualizado para veículo 235.");

        // Requisitar uma corrida
        Ride ride = new Ride(passenger, cabbie, "Campinas", "Rio de Janeiro");
        System.out.println(ride);

        // Processar pagamento
        Payment payment = new Payment("Pix");
        payment.processPayment();  // Pagamento não reconhecido
        payment = new Payment("Credit Card");
        payment.processPayment();  // Pagamento aceito

        // Finalizar corrida
        System.out.println("Corrida finalizada.");
    }
}
