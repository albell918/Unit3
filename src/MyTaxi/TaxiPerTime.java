package MyTaxi;

/**
 * @author Bieliaiev Oleksandr
 * @version 1.0.0
 * @project Unit3
 * @class TaxiPerTime
 * @since 31.03.2021 - 21.23
 */
public class TaxiPerTime extends Taxi implements ICalculate
{
    private double fuelPerHour;
    private double feePerHour;
    private double hours;

    public TaxiPerTime() {
    }

    public TaxiPerTime(int raceId, String craNumber, String carModel, double fuelPerHour, double feePerHour, double hours) {
        super(raceId, craNumber, carModel);
        this.fuelPerHour = fuelPerHour;
        this.feePerHour = feePerHour;
        this.hours = hours;
    }

    public double getFuelPerHour() {
        return fuelPerHour;
    }

    public void setFuelPerHour(double fuelPerHour) {
        this.fuelPerHour = fuelPerHour;
    }

    public double getFeePerHour() {
        return feePerHour;
    }

    public void setFeePerHour(double feePerHour) {
        this.feePerHour = feePerHour;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public double calcRevenue() {
        return this.getHours()*(this.getFeePerHour()-this.getFuelPerHour());
    }

    @Override
    public String toString() {
        return "TaxiPerTime{" +super.toString()+
                "fuelPerHour=" + fuelPerHour +
                ", feePerHour=" + feePerHour +
                ", hours=" + hours +
                '}';
    }
}
