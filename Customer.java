import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int identifier;
    private String name;
    private List<ElectricCar> electricCars;

    public Customer(int identifier, String name) {
        this.identifier = identifier;
        this.name = name;
        this.electricCars = new ArrayList<>();
    }

    public int getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    public List<ElectricCar> getElectricCars() {
        return electricCars;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addElectricCar(ElectricCar electricCar) {
        electricCars.add(electricCar);
    }

    public void removeElectricCar(ElectricCar electricCar) {
        electricCars.remove(electricCar);
    }

    public void updateChargingStation(ElectricCar electricCar, ChargingStation chargingStation) {
        if (electricCars.contains(electricCar)) {
            electricCar.setChargingStation(chargingStation.getLocation());
        } else {
            System.out.println("Electric car does not belong to this customer.");
        }
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Customer: ").append(name).append("\n");
        for (ElectricCar electricCar : electricCars) {
            sb.append("Car Model: ").append(electricCar.getCarModel()).append("\n");
            sb.append("Car Manufacturer: ").append(electricCar.getCarManufacturer()).append("\n");
            sb.append("Charging Station: ").append(electricCar.getChargingStation()).append("\n");
            sb.append("----------------------\n");
        }
        return sb.toString();
    }
}
