package project.util;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {

	 // Método privado para gerar um valor aleatorio que corresponderá ao valor da corrida
	 private static double generateRandomArbitrary() {
        Integer min = 20;
        Integer max = 90;

        Random random = new Random();
        // Gera um valor aleatório entre 0.0 (inclusive) e 1.0 (exclusive)
        double randomValue = random.nextDouble();
        
        // Escala o valor para o intervalo desejado
        return min + (randomValue * (max - min));
	 }
}

