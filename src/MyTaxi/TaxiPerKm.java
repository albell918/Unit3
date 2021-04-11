package MyTaxi;

/**
 * @author Bieliaiev Oleksandr
 * @version 1.0.0
 * @project Unit3
 * @class TaxiPerKm
 * @since 31.03.2021 - 21.24
 */
public class TaxiPerKm extends Taxi implements ICalculate{

    private double basicFee;
    private double feePerKilometer;
    private double fuelPerKM;
    private double kilometres;


    public TaxiPerKm(int raceId, String carNumber, String carModel, double basicFee, double feePerKilometer, double fuelPerKM, double kilometres) {
        super(raceId, carNumber, carModel);
        this.basicFee = basicFee;
        this.feePerKilometer = feePerKilometer;
        this.fuelPerKM = fuelPerKM;
        this.kilometres = kilometres;
    }

    public TaxiPerKm() {
    }

    public double getBasicFee() {
        return basicFee;
    }

    public void setBasicFee(double basicFee) {
        this.basicFee = basicFee;
    }

    public double getFeePerKilometer() {
        return feePerKilometer;
    }

    public void setFeePerKilometer(double feePerKilometer) {
        this.feePerKilometer = feePerKilometer;
    }

    public double getFuelPerKM() {
        return fuelPerKM;
    }

    public void setFuelPerKM(double fuelPerKM) {
        this.fuelPerKM = fuelPerKM;
    }

    public double getKilometres() {
        return kilometres;
    }

    public void setKilometres(double kilometres) {
        this.kilometres = kilometres;
    }

    @Override
    public double calcRevenue() {
        return this.getBasicFee()+this.getKilometres()*(this.getFeePerKilometer()-this.getFuelPerKM());
    }

    @Override
    public String toString() {
        return "TaxiPerKm{" +super.toString()+
                "basicFee=" + basicFee +
                ", feePerKilometer=" + feePerKilometer +
                ", fuelPerKM=" + fuelPerKM +
                ", kilometres=" + kilometres +
                '}';
    }

    @Override
    public String showCarNumber() {
        return this.getCarNumber();
    }
}
