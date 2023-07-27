import java.util.List;
import java.util.ArrayList;

public class Manufacturer {
    private int identifier;
    private String name;
    private List<String> carModels;

    public Manufacturer(int identifier, String name) {
        this.identifier = identifier;
        this.name = name;
        this.carModels = new ArrayList<>();
    }

    public int getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    public List<String> getCarModels() {
        return carModels;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCarModel(String carModel) {
        carModels.add(carModel);
    }

    public void removeCarModel(String carModel) {
        carModels.remove(carModel);
    }

    @Override
    public String toString() {
        return name + ": " + carModels;
    }
}
