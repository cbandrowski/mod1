public class Vehicle {
    //attributes
    private int numberOfWheels;
    private String color;
    private Float engineSize;
    private String fuelType;

    public Vehicle(String color, Float engineSize, String fuelType, int numberOfWheels) {
        this.color = color;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Float getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(Float engineSize) {
        this.engineSize = engineSize;
    }

}
