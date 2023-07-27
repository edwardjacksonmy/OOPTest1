import java.util.ArrayList;
import java.util.List;

public class ChargingStation {
    private int identifier;
    private String location;
    private double availableChargingCapacity;

    public ChargingStation(int identifier, String location, double availableChargingCapacity) {
        this.identifier = identifier;
        this.location = location;
        this.availableChargingCapacity = availableChargingCapacity;
    }

    public int getIdentifier() {
        return identifier;
    }

    public String getLocation() {
        return location;
    }

    public double getAvailableChargingCapacity() {
        return availableChargingCapacity;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAvailableChargingCapacity(double availableChargingCapacity) {
        this.availableChargingCapacity = availableChargingCapacity;
    }
    @Override
    public String toString() {
        return "Location: " + location + ", Available Charging Capacity: " + availableChargingCapacity;
    }
}
