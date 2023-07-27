public class Test {
    public static void main(String[] args) {
        // Create electric car manufacturers
        Manufacturer teslaManufacturer = new Manufacturer(1, "Tesla");
        Manufacturer nissanManufacturer = new Manufacturer(2, "Nissan");
        Manufacturer hondaManufacturer = new Manufacturer(3, "Honda");

        // Add car models to the manufacturers
        teslaManufacturer.addCarModel("Model S");
        teslaManufacturer.addCarModel("Model Y");
        nissanManufacturer.addCarModel("Leaf");
        hondaManufacturer.addCarModel("NSX (NC1)");

        // Create charging stations
        ChargingStation chargingStation1 = new ChargingStation(1, "Impian Emas", 100.0);
        ChargingStation chargingStation2 = new ChargingStation(2, "Permas Jaya", 80.0);

        // Create customers
        Customer customer1 = new Customer(1, "Ms Shamilla");
        Customer customer2 = new Customer(2, "Soh Joen Shiuan");

        // Create electric cars
        ElectricCar teslaCar1 = new Tesla(1, "Model S", "Tesla", true, 85.5);
        ElectricCar teslaCar2 = new Tesla(3, "Leaf", "Nissan", true, 75.0);
        ElectricCar hondaCar1 = new Ora(2, "NSX (NC1)", "Honda", true, 60.0);

        // Add electric cars to customers
        customer1.addElectricCar(teslaCar1);
        customer1.addElectricCar(hondaCar1);
        customer2.addElectricCar(teslaCar2);


        // Update charging station for an electric car
        customer1.updateChargingStation(teslaCar1, chargingStation1);
        customer2.updateChargingStation(teslaCar2, chargingStation2);

        // Display electric car manufacturers and their car models
        System.out.println("Electric Car Manufacturers and Car Models:");
        System.out.println(teslaManufacturer);
        System.out.println(nissanManufacturer);
        System.out.println(hondaManufacturer);

        // Display the list of electric cars owned by each customer and their corresponding details
        System.out.println("\nCustomer 1 Electric Cars:");
        System.out.println(customer1);

        System.out.println("\nCustomer 2 Electric Cars:");
        System.out.println(customer2);
    }
}
