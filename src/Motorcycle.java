public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String make, String plate, String color, VehicleType category, boolean hasSidecar) {
        super(make, plate, color, category);
        this.hasSidecar = hasSidecar;
    }

    public boolean hasSidecar() {
        return hasSidecar;
    }
    @Override
    public String getVehicle(){
        return "motorCycle";
    }
    @Override
    public String toString() {
        return super.toString() + (hasSidecar() ? "\n\t- with sidecar" : "\n\t- without sidecar");


    }
}
