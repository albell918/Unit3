package MyTaxi;

/**
 * @author Bieliaiev Oleksandr
 * @version 1.0.0
 * @project Unit3
 * @class Taxi
 * @since 31.03.2021 - 21.19
 */
public class Taxi implements ICalculate{

    private int rideId;
    private String craNumber;
    private String carModel;


    public Taxi() {
    }

    public Taxi(int raceId, String craNumber, String carModel) {
        this.rideId = raceId;
        this.craNumber = craNumber;
        this.carModel = carModel;
    }

    public int getRideId() {
        return rideId;
    }

    public void setRideId(int rideId) {
        this.rideId = rideId;
    }

    public String getCraNumber() {
        return craNumber;
    }

    public void setCraNumber(String craNumber) {
        this.craNumber = craNumber;
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
                ", craNumber='" + craNumber + '\'' +
                ", carModel='" + carModel + '\'' +
                '}';
    }

    @Override
    public double calcRevenue() {
        return 0;
    }
}