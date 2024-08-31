public class Car extends Vehicle {
    // Additional attribute
    private String brand;

    // Constructor
    public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand) {
        super(color, engineSize, fuelType, numberOfWheels);  // Calling the constructor of the Vehicle class
        this.brand = brand;
    }

    // Getter and Setter for brand
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Method to honk
    public void honk() {
        System.out.println("Honk, honk!");
    }

    // Method to display all information
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Number of Wheels: " + getNumberOfWheels());
        System.out.println("Color: " + getColor());
        System.out.println("Engine Size: " + getEngineSize() + "L");
        System.out.println("Fuel Type: " + getFuelType());
    }

    // Optional: Override toString method for easier display
    @Override
    public String toString() {
        return "Car [brand=" + brand + ", numberOfWheels=" + getNumberOfWheels() +
                ", color=" + getColor() + ", engineSize=" + getEngineSize() +
                "L, fuelType=" + getFuelType() + "]";
    }
}


