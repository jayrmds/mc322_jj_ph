package project.main;

import project.person.Person;
import project.taxi.Taxi;
import project.cabbie.Cabbie;
import project.util.Util;
import project.passenger.Passenger;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {


		

		Passenger passanger = new Passenger("Alex");
		System.out.println("Informe o seu destino: ");
        
		// Obter input do user
		Scanner in = new Scanner(System.in);
		String userId = in.nextLine();

		System.out.println("Procurando um taxista nas proximidades... Aguarde ;) ");

		Cabbie cabbie = new Cabbie("Marta");

		System.out.println("Informacoes validadas para o jogador: " + userId);
			
			

			


		// 	Jogador jogadorEscolhido = Jogador.getJogadorPorId(Integer.parseInt(userId));
		// 	System.out.println("O jogador "+ jogadorEscolhido.getNome() + " possui "
		// 	+ jogadorEscolhido.numeroDeCartas() +  "" );
			
		
	}

}
