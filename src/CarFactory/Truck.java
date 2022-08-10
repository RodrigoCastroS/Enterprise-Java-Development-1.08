package CarFactory;

import java.math.BigDecimal;

public class Truck extends Car{
    private BigDecimal towingCapacity;

    public Truck(int vinNumber, String make, String model, int mileage, BigDecimal towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    public BigDecimal getTowingCapacity() {
        return towingCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vinNumber=" + getVinNumber() +
                ", make='" + getMake() + '\'' +
                ", model='" + getModel() + '\'' +
                ", mileage=" + getMileage() +
                ", model='" + getTowingCapacity() + '\'' +
                '}';
    }
}
