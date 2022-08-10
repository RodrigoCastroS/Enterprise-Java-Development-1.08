import CarFactory.UtilityVehicle;
import Model.HelperMethods;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        BigDecimal refNumber = new BigDecimal("5498.98034");
        BigDecimal posNumber = new BigDecimal("-54.23034");
        BigDecimal negNumber = new BigDecimal("98.67034");

        // 1st exercise
        System.out.println(HelperMethods.bigDecimalToDouble(refNumber));
        // 2nd exercise
        System.out.println(HelperMethods.reverseNumberValue(posNumber));
        System.out.println(HelperMethods.reverseNumberValue(negNumber));

        UtilityVehicle van = new UtilityVehicle(809234980, "honda", "civic", 210434, false);
        System.out.println("VAN ---------------------------");
        System.out.println(van);
    }


}
