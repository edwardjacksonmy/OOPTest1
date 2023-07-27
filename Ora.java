public class Ora extends ElectricCar {
    private boolean hasPanoramicSunroof;
    private boolean hasWirelessCharging;

    public Ora(int identifier, String carModel, String carManufacturer, boolean carStatus, double batteryCapacity) {
        super(identifier, carModel, carManufacturer, carStatus, batteryCapacity);
    }
    public boolean hasPanoramicSunroof() {
        return hasPanoramicSunroof;
    }

    public boolean hasWirelessCharging() {
        return hasWirelessCharging;
    }

    public void setPanoramicSunroof(boolean hasPanoramicSunroof) {
        this.hasPanoramicSunroof = hasPanoramicSunroof;
    }

    public void setWirelessCharging(boolean hasWirelessCharging) {
        this.hasWirelessCharging = hasWirelessCharging;
    }
}
