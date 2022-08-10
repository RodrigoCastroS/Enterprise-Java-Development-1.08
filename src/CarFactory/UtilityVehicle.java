package CarFactory;

public class UtilityVehicle extends Car{

    private boolean fourWheelDrive;

    public UtilityVehicle(int vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vinNumber=" + getVinNumber() +
                ", make='" + getMake() + '\'' +
                ", model='" + getModel() + '\'' +
                ", fourWheelDrive='" + isFourWheelDrive() + '\'' +
                ", mileage=" + getMileage() +
                '}';
    }

}
