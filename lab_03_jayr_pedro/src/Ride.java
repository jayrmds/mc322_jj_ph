import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;

/**
 * Classe que representa uma corrida de táxi.
 */
public class Ride {
    private Passenger passenger;
    private Cabbie cabbie;
    private Location start;
    private Location end;
    private LocalDateTime startTime;
    private double distance;
    private double fare;

    /**
     * Construtor da classe Ride.
     *
     * @param passenger Passageiro que solicita a corrida
     * @param cabbie Motorista que irá realizar a corrida
     * @param start Local de origem da corrida
     * @param end Local de destino da corrida
     * @param startTime Horário de início da corrida
     */
    public Ride(Passenger passenger, Cabbie cabbie, Location start, Location end, LocalDateTime startTime) {
        this.passenger = passenger;
        this.cabbie = cabbie;
        this.start = start;
        this.end = end;
        this.startTime = startTime;
        this.distance = calculateDistance(start, end);
        this.fare = calculateFare();
    }

    /**
     * Calcula a distância Euclidiana entre o ponto de origem e destino.
     *
     * @param start Local de origem
     * @param end Local de destino
     * @return Distância calculada
     */
    private double calculateDistance(Location start, Location end) {
        return Math.sqrt(Math.pow(end.getX() - start.getX(), 2) + Math.pow(end.getY() - start.getY(), 2));
    }

    /**
     * Calcula a tarifa da corrida com base na distância e horário.
     * Tarifa base e preço por km variam de acordo com o horário (diurno/noturno) e distância.
     *
     * @return Valor da corrida
     */
    private double calculateFare() {
        double baseFare;
        double perKmFare;

        // Definindo os valores de base e por km dependendo da distância e horário
        if (distance <= 5) {
            if (isNightTime()) {
                baseFare = 6.00;
                perKmFare = 2.50;
            } else {
                baseFare = 5.00;
                perKmFare = 2.00;
            }
        } else if (distance <= 10) {
            if (isNightTime()) {
                baseFare = 5.00;
                perKmFare = 3.00;
            } else {
                baseFare = 4.00;
                perKmFare = 2.50;
            }
        } else if (distance <= 15) {
            if (isNightTime()) {
                baseFare = 4.50;
                perKmFare = 3.50;
            } else {
                baseFare = 3.50;
                perKmFare = 3.00;
            }
        } else if (distance <= 20) {
            if (isNightTime()) {
                baseFare = 4.00;
                perKmFare = 4.50;
            } else {
                baseFare = 3.00;
                perKmFare = 4.00;
            }
        } else {
            if (isNightTime()) {
                baseFare = 3.50;
                perKmFare = 4.00;
            } else {
                baseFare = 2.50;
                perKmFare = 3.50;
            }
        }

        // Retorna o valor da corrida com base na distância
        return baseFare + (distance * perKmFare);
    }

    /**
     * Verifica se o horário atual está dentro do período noturno (entre 18h e 6h).
     *
     * @return true se for noturno, false se for diurno
     */
    private boolean isNightTime() {
        int hour = startTime.getHour();
        return (hour >= 18 || hour < 6);
    }

    // Métodos getters para obter os dados da corrida

    /**
     * Retorna o local de início da corrida.
     *
     * @return Local de início (Location)
     */
    public Location getStart() {
        return start;
    }

    /**
     * Retorna o local de fim da corrida.
     *
     * @return Local de destino (Location)
     */
    public Location getEnd() {
        return end;
    }

    /**
     * Retorna o horário de início da corrida.
     *
     * @return Horário de início (LocalDateTime)
     */
    public LocalDateTime getStartTime() {
        return startTime;
    }

    /**
     * Arredonda o valor para duas casas decimais.
     *
     * @param value Valor a ser arredondado
     * @return Valor arredondado
     */
    private double round(double value) {
        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    /**
     * Retorna a distância arredondada para duas casas decimais.
     *
     * @return Distância da corrida arredondada
     */
    public double getDistance() {
        return round(distance);
    }

    /**
     * Retorna a tarifa arredondada para duas casas decimais.
     *
     * @return Valor da corrida arredondado
     */
    public double getFare() {
        return round(fare);
    }

    @Override
    public String toString() {
        return "Corrida de " + start + " para " + end + ", distância: " + distance + " km, valor: R$" + fare;
    }
}
