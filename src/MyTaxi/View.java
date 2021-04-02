package MyTaxi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

/**
 * @author Bieliaiev Oleksandr
 * @version 1.0.0
 * @project Unit3
 * @class Main
 * @since 31.03.2021 - 21.37
 */
public class View {
    public static void main(String[] args) {

        TaxiPerKm tpkm1 = new TaxiPerKm(10, "Az-111", "ZAZ-1103", 25, 7, 2.5, 4);

        List<ICalculate> list = new ArrayList<>(
                Arrays.asList(

                        new TaxiPerKm(1, "Az-111", "ZAZ-1103", 25, 7, 2.5, 4),
                        new TaxiPerKm(2, "Az-111", "ZAZ-1103", 25, 7, 2.5, 3),
                        new TaxiPerKm(3, "XA-622-CC", "Daewoo Lanos", 30, 7, 2.5, 15),
                        new TaxiPerKm(4, "XA-622-CC", "Daewoo Lanos", 30, 7, 2.5, 8.5),
                        new TaxiPerKm(5, "AX79-91", "Renault 11", 20, 6, 2, 5.5),
                        new TaxiPerKm(6, "AX79-91", "Renault 11", 20, 6, 2, 10.25),
                        new TaxiPerTime(7, "AX82-17-NM", "Renault Logan", 84, 125, 4.0),
                        new TaxiPerTime(8, "AX19-17-KI", "VAZ-09", 80, 115, 4.0),
                        new TaxiPerKm(9, "XA-622-CC", "Daewoo Lanos", 30, 7, 2.5, 8.0)


                )
        );

        double totalRevenue = list.stream().mapToDouble(ICalculate::calcRevenue).sum();
        double minRevenuePerRide = list.stream().mapToDouble(ICalculate::calcRevenue).min().getAsDouble();
        double maxRevenuePerRide = list.stream().mapToDouble(ICalculate::calcRevenue).max().getAsDouble();
        list.stream().filter(ride -> ride.calcRevenue() > 50).forEach(car -> System.out.println("Rides with 50+ revenue :" + car + "Revenue :" + car.calcRevenue()));
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        list.stream().filter(TaxiPerTime.class::isInstance).forEach(car -> System.out.println("Time Fee: " + car));
        System.out.println("---------------------------------------------------------------------------------------------------------------------");

//        list.stream().filter(ride->ride.getClass().isInstance(new TaxiPerTime)).forEach();


//     arrStream.filter(ride->ride.calcRevenue()>50).forEach(car-> System.out.println("Rides with 50+ revenue :"+car+"Revenue :"+car.calcRevenue()));

        System.out.println(" Total revenue is :" + totalRevenue + " Max per ride :" + maxRevenuePerRide + " Min per ride :" + minRevenuePerRide);

    }

}

//        Rides with 50+ revenue :TaxiPerKm{Taxi{rideId=3, craNumber='XA-622-CC', carModel='Daewoo Lanos'}basicFee=30.0, feePerKilometer=7.0, fuelPerKM=2.5, kilometres=15.0}Revenue :97.5
//        Rides with 50+ revenue :TaxiPerKm{Taxi{rideId=4, craNumber='XA-622-CC', carModel='Daewoo Lanos'}basicFee=30.0, feePerKilometer=7.0, fuelPerKM=2.5, kilometres=8.5}Revenue :68.25
//        Rides with 50+ revenue :TaxiPerKm{Taxi{rideId=6, craNumber='AX79-91', carModel='Renault 11'}basicFee=20.0, feePerKilometer=6.0, fuelPerKM=2.0, kilometres=10.25}Revenue :61.0
//        Rides with 50+ revenue :TaxiPerTime{Taxi{rideId=7, craNumber='AX82-17-NM', carModel='Renault Logan'}fuelPerHour=84.0, feePerHour=125.0, hours=4.0}Revenue :164.0
//        Rides with 50+ revenue :TaxiPerTime{Taxi{rideId=8, craNumber='AX19-17-KI', carModel='VAZ-09'}fuelPerHour=80.0, feePerHour=115.0, hours=4.0}Revenue :140.0
//        Rides with 50+ revenue :TaxiPerKm{Taxi{rideId=9, craNumber='XA-622-CC', carModel='Daewoo Lanos'}basicFee=30.0, feePerKilometer=7.0, fuelPerKM=2.5, kilometres=8.0}Revenue :66.0
//        ---------------------------------------------------------------------------------------------------------------------
//        Time Fee: TaxiPerTime{Taxi{rideId=7, craNumber='AX82-17-NM', carModel='Renault Logan'}fuelPerHour=84.0, feePerHour=125.0, hours=4.0}
//        Time Fee: TaxiPerTime{Taxi{rideId=8, craNumber='AX19-17-KI', carModel='VAZ-09'}fuelPerHour=80.0, feePerHour=115.0, hours=4.0}
//        ---------------------------------------------------------------------------------------------------------------------
//        Total revenue is :720.25 Max per ride :164.0 Min per ride :38.5