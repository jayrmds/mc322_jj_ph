// Pedro Henrique da Silva - RA223327
// Jayr Junior Mendes - RA218445

import java.time.LocalDateTime;
import java.util.Scanner;
import utils.CabbieInfoGenerator;
import utils.PassengerInfoGenerator;
import utils.VehicleInfoGenerator;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cadastro de um passageiro utilizando o PassengerInfoGenerator
        PassengerInfoGenerator passengerGenerator = new PassengerInfoGenerator();
        Passenger passenger = new Passenger(Integer.parseInt(passengerGenerator.getPassengerId().replaceAll("[^0-9]", "").substring(0, 5)), passengerGenerator.getName());
        passenger.setStartLocation(Location.SHOPPING);
        passenger.setDestination(Location.ESCOLA);
        System.out.println("Pessoa passageira " + passenger.getId() + " (" + passenger.getName() + ") criada com sucesso.");

        // Cadastro de um taxista utilizando o Cabbie1InfoGenerator
        CabbieInfoGenerator cabbieGenerator = new CabbieInfoGenerator();
        Cabbie cabbie = new Cabbie(cabbieGenerator.getCabbieId(), cabbieGenerator.getName(), cabbieGenerator.getRate());
        System.out.println("Pessoa motorista " + cabbie.getId() + " (" + cabbie.getName() + ") criada com sucesso.");

        // Cadastro de um veículo utilizando o VehicleInfoGenerator
        VehicleInfoGenerator vehicleGenerator = new VehicleInfoGenerator();
        Vehicle vehicle = new Vehicle(Integer.parseInt(vehicleGenerator.getVehicleId().replaceAll("[^0-9]", "").substring(0, 5)), vehicleGenerator.getModel());
        System.out.println("Veículo " + vehicle.getId() + " (" + vehicleGenerator.getModel() + " " + vehicleGenerator.getYear() + ") criado com sucesso.");

        // Criação de corrida
        Ride ride = new Ride(passenger, cabbie, LocalDateTime.now());
        System.out.println("Corrida chamada por pessoa passageira " + passenger.getId() + " de " + passenger.getStartLocation() + " para " + passenger.getDestination());
        System.out.println("Status da corrida: " + ride.getStatus());
        System.out.println("Distância calculada: " + ride.getDistance());

        // Aceitar a corrida
        ride.startRide();
        System.out.println("Corrida aceita por pessoa motorista " + cabbie.getId());
        System.out.println("Status da corrida: " + ride.getStatus());

        // Seleção da forma de pagamento
        System.out.println("Escolha a forma de pagamento (1 - Cartão de Crédito, 2 - Débito, 3 - Pix, 4 - Dinheiro, 5 - Voucher): ");
        int paymentChoice = scanner.nextInt();
        PaymentMethod paymentMethod;

        switch (paymentChoice) {
            case 1:
                paymentMethod = new CreditCardPayment(ride.isNightTime());
                System.out.println("Forma de pagamento selecionada: Cartão de Crédito");
                break;
            case 2:
                paymentMethod = new DebitCardPayment(ride.isNightTime());
                System.out.println("Forma de pagamento selecionada: Cartão de Débito");
                break;
            case 3:
                paymentMethod = new PixPayment(ride.isNightTime());
                System.out.println("Forma de pagamento selecionada: Pix");
                break;
            case 4:
                paymentMethod = new CashPayment();
                System.out.println("Forma de pagamento selecionada: Dinheiro");
                break;
            case 5:
                paymentMethod = new VoucherPayment(ride.isNightTime());
                System.out.println("Forma de pagamento selecionada: Voucher");
                break;
            default:
                System.out.println("Opção inválida. Pagamento será feito em dinheiro por padrão.");
                paymentMethod = new CashPayment();
                break;
        }

        double finalFare = paymentMethod.calculatePayment(ride.getFare(), ride.getDistance());
        System.out.println("Valor da corrida definido: R$ " + finalFare);

        // Finalizar corrida
        ride.endRide();
        System.out.println("Status da corrida: " + ride.getStatus());
        System.out.println("Corrida finalizada.");
        scanner.close();
    }
}
