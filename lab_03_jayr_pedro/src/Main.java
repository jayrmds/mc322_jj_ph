import java.util.ArrayList;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Cadastro de um passageiro
        Passenger passenger = new Passenger(1, "Gabriela");
        System.out.println("Pessoa passageira " + passenger.getId() + " criada com sucesso.");

        // Cadastro de um taxista
        Cabbie cabbie = new Cabbie(1, "Felipe", 5.0);
        System.out.println("Pessoa motorista " + cabbie.getId() + " criada com sucesso.");

        // Cadastro de um veículo
        Vehicle vehicle = new Vehicle(1, "Toyota Corolla");
        System.out.println("Veículo " + vehicle.getId() + " criado com sucesso.");

        // Criar uma corrida
        Ride ride = new Ride(passenger, cabbie, Location.SHOPPING, Location.ESTACAO_TREM, LocalDateTime.now());
        System.out.println("Corrida chamada de " + ride.getStart() + " para " + ride.getEnd());
        System.out.println("Distância calculada: " + ride.getDistance());

        // Seleção do pagamento
        PaymentMethod paymentMethod = new CreditCardPayment();
        double finalFare = paymentMethod.calculatePayment(ride.getFare(), ride.getDistance());
        System.out.println("Forma de pagamento: Credit Card");
        System.out.println("Valor final: R$ " + finalFare);

        // Finalizar corrida
        System.out.println("Corrida finalizada.");
    }
}
