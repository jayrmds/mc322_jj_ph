import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ride {
    private Location start;
    private Location end;
    private LocalDateTime startTime;
    private double distance;
    private double fare;
    private RideStatus status;

    public Ride(Passenger passenger, Cabbie cabbie, LocalDateTime startTime) {
        this.start = passenger.getStartLocation();
        this.end = passenger.getDestination();
        this.startTime = startTime;
        this.distance = calculateDistance(start, end);
        this.status = RideStatus.CHAMADA;
        this.fare = calculateFare();
    }

    private double calculateDistance(Location start, Location end) {
        return Math.sqrt(Math.pow(end.getX() - start.getX(), 2) + Math.pow(end.getY() - start.getY(), 2));
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public boolean isNightTime() {
        LocalTime time = startTime.toLocalTime();
        return (time.isAfter(LocalTime.of(18, 0)) || time.isBefore(LocalTime.of(6, 0)));
    }
    
    private double calculateFare() {
        double baseFare = 5.00;
        double perKmFare = isNightTime() ? 3.00 : 2.00;
        return baseFare + (distance * perKmFare);
    }

    public void startRide() {
        this.status = RideStatus.EM_PROGRESSO;
    }

    public void endRide() {
        this.status = RideStatus.FINALIZADA;
    }

    public RideStatus getStatus() {
        return status;
    }

    public Location getStart() {
        return start;
    }

    public Location getEnd() {
        return end;
    }

    public double getDistance() {
        return round(distance);
    }

    public double getFare() {
        return round(fare);
    }

    

    private double round(double value) {
        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public enum RideStatus {
        CHAMADA,
        EM_PROGRESSO,
        FINALIZADA
    }
    
}
