public class Vehicle {
    private String make;
    private String plate;
    private String color;
    private VehicleType category;

    // Constructor for initializing vehicle properties
    public Vehicle(String make, String plate, String color, VehicleType category) {
        this.make = make;
        this.plate = plate;
        this.color = color;
        this.category = category;
    }

    // Getters for vehicle properties
    public String getMake() {
        return make;
    }

    public String getPlate() {
        return plate;
    }

    public String getColor() {
        return color;
    }

    public VehicleType getCategory() {
        return category;
    }
    public String getVehicle(){
        return "Vehicle";
    }
    @Override
    public String toString() {

        return "Employee has a " + getVehicle()+
                "\n\t- make : " + make  +
                "\n\t- plate : " + plate  +
                "\n\t- color : " + color  +
                "\n\t- category : " + category
                ;
    }
}
