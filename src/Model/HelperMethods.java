package Model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class HelperMethods {

    public static double bigDecimalToDouble(BigDecimal number){
        return number.setScale(2, RoundingMode.HALF_EVEN).doubleValue();
    }

    public static BigDecimal reverseNumberValue(BigDecimal number){
        // Checks if the value is positive
        if(number.compareTo(BigDecimal.ZERO) > 0){
            // converts  number to negative with negate() and to one decimal rounded
            return  number.setScale(1, RoundingMode.HALF_EVEN).negate();
        } else {
            // converts number to positive with abs() and to one decimal rounded
            return number.setScale(1, RoundingMode.HALF_EVEN).abs();
        }

    }
}
