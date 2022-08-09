import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

        BigDecimal refNumber = new BigDecimal("5498.98034");
        BigDecimal posNumber = new BigDecimal("-54.23034");
        BigDecimal negNumber = new BigDecimal("98.67034");
        System.out.println(bigDecimalToDouble(refNumber));

        System.out.println(reverseNumberValue(posNumber));
        System.out.println(reverseNumberValue(negNumber));
    }

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
