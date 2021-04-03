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

        List<ICalculate> list = new ArrayList<>(
                Arrays.asList(

                        new TaxiPerKm(1, "Az-111", "ZAZ-1103", 25, 7, 2.5, 4),
                        new TaxiPerKm(2, "Az-111", "ZAZ-1103", 25, 7, 2.5, 3),
                        new TaxiPerKm(3, "XA-622-CC", "Daewoo Lanos", 30, 7, 2.75, 15),
                        new TaxiPerKm(4, "XA-622-CC", "Daewoo Lanos", 30, 7, 2.75, 8.5),
                        new TaxiPerKm(5, "AX79-91", "Renault 11", 20, 6, 2, 5.5),
                        new TaxiPerKm(6, "AX79-91", "Renault 11", 20, 6, 2, 10.25),
                        new TaxiPerTime(7, "AX82-17-NM", "Renault Logan", 84, 125, 4.0),
                        new TaxiPerTime(8, "AX19-17-KI", "VAZ-09", 80, 115, 4.0),
                        new TaxiPerKm(9, "XA-622-CC", "Daewoo Lanos", 30, 7, 2.75, 8.0),
                        new TaxiPerTime(10, "AX79-91", "Renault 11", 60, 90, 2),
                        new TaxiPerTime(11, "AX79-91", "Renault 11", 60, 90, 5),
                        new TaxiPerTime(7, "AX82-17-NM", "Renault Logan", 84, 125, 2.5)


                )
        );

        double totalRevenue = list.stream().mapToDouble(ICalculate::calcRevenue).sum();
        double minRevenuePerRide = list.stream().mapToDouble(ICalculate::calcRevenue).min().getAsDouble();
        double maxRevenuePerRide = list.stream().mapToDouble(ICalculate::calcRevenue).max().getAsDouble();
        list.stream().filter(ride -> ride.calcRevenue() > 50).forEach(ride -> System.out.println("Rides with 50+ revenue :" + ride + "Revenue :" + ride.calcRevenue()));
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        list.stream().filter(TaxiPerTime.class::isInstance).forEach(car -> System.out.println("Time Fee: " + car));
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        list.stream().filter(ride -> ride.showCarNumber() == "AX79-91").forEach((car -> System.out.println("\"AX79-91\": " + car)));
        System.out.println("---------------------------------------------------------------------------------------------------------------------");

//        list.stream().filter(ride->ride.getClass().isInstance(new TaxiPerTime)).forEach();

        double avgRevenuePerTIme = list.stream().filter(TaxiPerTime.class::isInstance).mapToDouble(ICalculate::calcRevenue).average().getAsDouble();
        double avgRevenuePerKm = list.stream().filter(TaxiPerKm.class::isInstance).mapToDouble(ICalculate::calcRevenue).average().getAsDouble();

        System.out.println("Average revenue PER KM is :" + avgRevenuePerKm + " Average revenue PER TIME is :" + avgRevenuePerTIme);
        System.out.println("---------------------------------------------------------------------------------------------------------------------");

        System.out.println(" Total revenue is :" + totalRevenue + " Max per ride :" + maxRevenuePerRide + " Min per ride :" + minRevenuePerRide);

    }

}

//        Rides with 50+ revenue :TaxiPerKm{Taxi{rideId=3, craNumber='XA-622-CC', carModel='Daewoo Lanos'}basicFee=30.0, feePerKilometer=7.0, fuelPerKM=2.75, kilometres=15.0}Revenue :93.75
//        Rides with 50+ revenue :TaxiPerKm{Taxi{rideId=4, craNumber='XA-622-CC', carModel='Daewoo Lanos'}basicFee=30.0, feePerKilometer=7.0, fuelPerKM=2.75, kilometres=8.5}Revenue :66.125
//        Rides with 50+ revenue :TaxiPerKm{Taxi{rideId=6, craNumber='AX79-91', carModel='Renault 11'}basicFee=20.0, feePerKilometer=6.0, fuelPerKM=2.0, kilometres=10.25}Revenue :61.0
//        Rides with 50+ revenue :TaxiPerTime{Taxi{rideId=7, craNumber='AX82-17-NM', carModel='Renault Logan'}fuelPerHour=84.0, feePerHour=125.0, hours=4.0}Revenue :164.0
//        Rides with 50+ revenue :TaxiPerTime{Taxi{rideId=8, craNumber='AX19-17-KI', carModel='VAZ-09'}fuelPerHour=80.0, feePerHour=115.0, hours=4.0}Revenue :140.0
//        Rides with 50+ revenue :TaxiPerKm{Taxi{rideId=9, craNumber='XA-622-CC', carModel='Daewoo Lanos'}basicFee=30.0, feePerKilometer=7.0, fuelPerKM=2.75, kilometres=8.0}Revenue :64.0
//        Rides with 50+ revenue :TaxiPerTime{Taxi{rideId=10, craNumber='AX79-91', carModel='Renault 11'}fuelPerHour=60.0, feePerHour=90.0, hours=2.0}Revenue :60.0
//        Rides with 50+ revenue :TaxiPerTime{Taxi{rideId=11, craNumber='AX79-91', carModel='Renault 11'}fuelPerHour=60.0, feePerHour=90.0, hours=5.0}Revenue :150.0
//        Rides with 50+ revenue :TaxiPerTime{Taxi{rideId=7, craNumber='AX82-17-NM', carModel='Renault Logan'}fuelPerHour=84.0, feePerHour=125.0, hours=2.5}Revenue :102.5
//        ---------------------------------------------------------------------------------------------------------------------
//        Time Fee: TaxiPerTime{Taxi{rideId=7, craNumber='AX82-17-NM', carModel='Renault Logan'}fuelPerHour=84.0, feePerHour=125.0, hours=4.0}
//        Time Fee: TaxiPerTime{Taxi{rideId=8, craNumber='AX19-17-KI', carModel='VAZ-09'}fuelPerHour=80.0, feePerHour=115.0, hours=4.0}
//        Time Fee: TaxiPerTime{Taxi{rideId=10, craNumber='AX79-91', carModel='Renault 11'}fuelPerHour=60.0, feePerHour=90.0, hours=2.0}
//        Time Fee: TaxiPerTime{Taxi{rideId=11, craNumber='AX79-91', carModel='Renault 11'}fuelPerHour=60.0, feePerHour=90.0, hours=5.0}
//        Time Fee: TaxiPerTime{Taxi{rideId=7, craNumber='AX82-17-NM', carModel='Renault Logan'}fuelPerHour=84.0, feePerHour=125.0, hours=2.5}
//        ---------------------------------------------------------------------------------------------------------------------
//        "AX79-91": TaxiPerKm{Taxi{rideId=5, craNumber='AX79-91', carModel='Renault 11'}basicFee=20.0, feePerKilometer=6.0, fuelPerKM=2.0, kilometres=5.5}
//        "AX79-91": TaxiPerKm{Taxi{rideId=6, craNumber='AX79-91', carModel='Renault 11'}basicFee=20.0, feePerKilometer=6.0, fuelPerKM=2.0, kilometres=10.25}
//        "AX79-91": TaxiPerTime{Taxi{rideId=10, craNumber='AX79-91', carModel='Renault 11'}fuelPerHour=60.0, feePerHour=90.0, hours=2.0}
//        "AX79-91": TaxiPerTime{Taxi{rideId=11, craNumber='AX79-91', carModel='Renault 11'}fuelPerHour=60.0, feePerHour=90.0, hours=5.0}
//        ---------------------------------------------------------------------------------------------------------------------
//        Average revenue PER KM is :58.339285714285715 Average revenue PER TIME is :123.3
//        Total revenue is :1024.875 Max per ride :164.0 Min per ride :38.5
//        ---------------------------------------------------------------------------------------------------------------------