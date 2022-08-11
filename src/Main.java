import CarFactory.UtilityVehicle;
import Model.HelperMethods;
import MovieFactory.TvSeries;

import java.math.BigDecimal;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        BigDecimal refNumber = new BigDecimal("5498.98034");
        BigDecimal posNumber = new BigDecimal("-54.23034");
        BigDecimal negNumber = new BigDecimal("98.67034");

        System.out.println("------------ Helper Methods -----------------");
        // 1st exercise
        System.out.println(HelperMethods.bigDecimalToDouble(refNumber));
        // 2nd exercise
        System.out.println(HelperMethods.reverseNumberValue(posNumber));
        System.out.println(HelperMethods.reverseNumberValue(negNumber));

        // 3rd exercise
        System.out.println("\n");
        System.out.println("------------ Car Factory -----------------");
        UtilityVehicle van = new UtilityVehicle(809234980, "honda", "civic", 210434, false);
        System.out.println(van);

        // 4th exercise
        System.out.println("\n");
        System.out.println("------------ Videos Factory -----------------");
        TvSeries theOffice = new TvSeries("The Office", "comedy", 12000, 6, "HBO", new Date(24-5-2015));

        System.out.println(theOffice);
    }


}
