public class Tesla extends ElectricCar {
    private boolean isAutoPilotEnabled;
    private boolean isFullSelfDrivingEnabled;
    private boolean isTeslaTheatreEnabled;

    public Tesla(int identifier, String carModel, String carManufacturer, boolean carStatus, double batteryCapacity) {
        super(identifier, carModel, carManufacturer, carStatus, batteryCapacity);
    }

    public boolean isAutoPilotEnabled() {
        return isAutoPilotEnabled;
    }

    public boolean isFullSelfDrivingEnabled() {
        return isFullSelfDrivingEnabled;
    }

    public boolean isTeslaTheatreEnabled() {
        return isTeslaTheatreEnabled;
    }

    public void setAutoPilotEnabled(boolean isAutoPilotEnabled) {
        this.isAutoPilotEnabled = isAutoPilotEnabled;
    }

    public void setFullSelfDrivingEnabled(boolean isFullSelfDrivingEnabled) {
        this.isFullSelfDrivingEnabled = isFullSelfDrivingEnabled;
    }

    public void setTeslaTheatreEnabled(boolean isTeslaTheatreEnabled) {
        this.isTeslaTheatreEnabled = isTeslaTheatreEnabled;
    }
}
