// Car.java
public class Car extends Vehicle {
    private Gear gear;
    private CarType type;

    public Car(String make, String plate, String color, VehicleType category, Gear gear, CarType type) {
        super(make, plate, color, category);
        this.gear = gear;
        this.type = type;
    }
    @Override
    public String getVehicle(){
        return "Car";
    }

    @Override
    public String toString() {
        return super.toString()  +
                "\n\t- gear type : " + gear +
                "\n\t- type : " + type ;
    }
}
