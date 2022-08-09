import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

        BigDecimal refNumber = new BigDecimal("5498.98034");
        System.out.println(bigDecimalToDouble(refNumber));

    }

    public static double bigDecimalToDouble(BigDecimal number){
       return number.setScale(2, RoundingMode.HALF_EVEN).doubleValue();
    }

}
