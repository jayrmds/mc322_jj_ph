import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instanciando os objetos
        Taxi taxi = new Taxi();
        Cabbie cabbie = new Cabbie();
        System.out.print("Digite o nome do passageiro: ");
        Passenger passenger = new Passenger(scanner.nextLine());

        // Definindo o destino do passageiro
        System.out.print("Digite o destino do passageiro: ");
        String destination = scanner.nextLine();
        passenger.setDestination(destination);
        passenger.performRole();

        // Simulação da corrida
        System.out.println(passenger.getName() + " chama um táxi");
        taxi.hail();

        System.out.println(passenger.getName() + " entra no táxi");
        System.out.println(passenger.getName() + " informa ao taxista o destino");

        taxi.setDestination(passenger.getDestination());

        
        // Gorjeta
        System.out.print("Deseja dar gorjeta? (s/n): ");
        char tipChoice = scanner.next().charAt(0);
        if (tipChoice == 's' || tipChoice == 'S') {
            System.out.println(passenger.getName() + " paga o táxista com gorjeta");
        }else{
            System.out.println(passenger.getName() + " paga o táxista sem gorjeta");
        }

        System.out.println(passenger.getName() + " sai do táxi");

        scanner.close();
    }
}
