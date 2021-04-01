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

//        TaxiPerKm t1r = new TaxiPerKm(1,"AZ-116","Volga-111",12.0,25.0);
//        TaxiPerKm t2r = new TaxiPerKm(2,"Es-226-AN","Renault 11",9.0,25.0);
//        TaxiPerTime t1t = new TaxiPerTime(3,"AA-222","ZAZ-101",10,20.0);

        TaxiPerKm tpkm1 = new TaxiPerKm(10,"Az-111","ZAZ-1103",25,7,2.5,4);

        List<ICalculate> list = new ArrayList<>(
                Arrays.asList(

                    new TaxiPerKm(1,"Az-111","ZAZ-1103",25,7,2.5,4),
                    new TaxiPerKm(2,"Az-111","ZAZ-1103",25,7,2.5,3),
                    new TaxiPerKm(3,"XA-622-CC","Daewoo Lanos",30,7,2.5,15),
                    new TaxiPerKm(4,"XA-622-CC","Daewoo Lanos",30,7,2.5,8.5),
                    new TaxiPerKm(5,"AX79-91","Renault 11",20,6,2,5.5),
                    new TaxiPerKm(6,"AX79-91","Renault 11",20,6,2,10.25),
                    new TaxiPerTime(7,"AX82-17-NM","Renault Logan",84,125,4.0),
                    new TaxiPerTime(8,"AX19-17-KI","VAZ-09",80,115,4.0),
                    new TaxiPerKm(9,"XA-622-CC","Daewoo Lanos",30,7,2.5,8.0)


                )
        );



        double totalRevenue = list.stream().mapToDouble(ICalculate::calcRevenue).sum();
//        double minRevenuePerRide = list.stream().mapToDouble(ICalculate::calcRevenue).min();
//        double maxRevenuePerRide = list.stream().mapToDouble(ICalculate::calcRevenue).max();



        Stream<ICalculate> arrStream = Stream.of(new TaxiPerKm(1,"Az-111","ZAZ-1103",25,7,2.5,4),
                new TaxiPerKm(2,"Az-111","ZAZ-1103",25,7,2.5,3),
                new TaxiPerKm(3,"XA-622-CC","Daewoo Lanos",30,7,2.5,15),
                new TaxiPerKm(4,"XA-622-CC","Daewoo Lanos",30,7,2.5,8.5),
                new TaxiPerKm(5,"AX79-91","Renault 11",20,6,2,5.5),
                new TaxiPerKm(6,"AX79-91","Renault 11",20,6,2,10.25),
                new TaxiPerTime(7,"AX82-17-NM","Renault Logan",84,125,4.0),
                new TaxiPerTime(8,"AX19-17-KI","VAZ-09",80,115,4.0),
                new TaxiPerKm(9,"XA-622-CC","Daewoo Lanos",30,7,2.5,8.0));




        arrStream.filter(ride->ride.calcRevenue()>50).forEach(car-> System.out.println("Rides with 50+ revenue :"+car+"Revenue :"+car.calcRevenue()));


        System.out.println(" Total revenue is :"+totalRevenue);



//        list.stream().filter(car->car.getClass()==TaxiPerTime);




//        System.out.println(" Total revenue is :"+totalRevenue+ " Max per ride :"+maxRevenuePerRide+" Min per ride :"+minRevenuePerRide);


// R logan 12/100
//        private double fuelPerHour;
//        private double feePerHour;
//        private double hours;

//        super(raceId, craNumber, carModel);
//        this.basicFee = basicFee;
//        this.feePerKilometer = feePerKilometer;
//        this.fuelPerKM = fuelPerKM;
//        this.kilometres = kilometres;

    }

}
