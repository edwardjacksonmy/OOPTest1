public class ElectricCar {
    private int identifier;
    private String carModel;
    private String carManufacturer;
    private boolean carStatus;
    private double batteryCapacity;
    private String chargingStation;

    public ElectricCar(int identifier, String carModel, String carManufacturer, boolean carStatus, double batteryCapacity) {
        this.identifier = identifier;
        this.carModel = carModel;
        this.carManufacturer = carManufacturer;
        this.carStatus = carStatus;
        this.batteryCapacity = batteryCapacity;
    }

    public int getIdentifier() {
        return identifier;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getCarManufacturer() {
        return carManufacturer;
    }

    public boolean getCarStatus() {
        return carStatus;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public String getChargingStation() {
        return chargingStation;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setCarManufacturer(String carManufacturer) {
        this.carManufacturer = carManufacturer;
    }

    public void setCarStatus(boolean carStatus) {
        this.carStatus = carStatus;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setChargingStation(String chargingStation) {
        this.chargingStation = chargingStation;
    }

    @Override
    public String toString() {
        return "Car Model: " + carModel + ", Car Manufacturer: " + carManufacturer +
                ", Charging Station: " + chargingStation;
    }
}
