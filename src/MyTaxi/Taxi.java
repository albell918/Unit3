package MyTaxi;

/**
 * @author Bieliaiev Oleksandr
 * @version 1.0.0
 * @project Unit3
 * @class Taxi
 * @since 31.03.2021 - 21.19
 */
public class Taxi{

    private int rideId;
    private String carNumber;
    private String carModel;


    public Taxi() {
    }

    public Taxi(int raceId, String carNumber, String carModel) {
        this.rideId = raceId;
        this.carNumber = carNumber;
        this.carModel = carModel;
    }

    public int getRideId() {
        return rideId;
    }

    public void setRideId(int rideId) {
        this.rideId = rideId;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "rideId=" + rideId +
                ", carNumber='" + carNumber + '\'' +
                ", carModel='" + carModel + '\'' +
                '}';
    }

}