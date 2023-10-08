public class Vehicle {

    //The Vehicle class should have the following encapsulated attributes:
    //The Vehicle class should have all-args constructor, getters and setters.

    private String make;
    private String model;
    private int year;
    private int topSpeed;

    public Vehicle(String make, String model, int year, int topSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.topSpeed = topSpeed;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }
    //he Vehicle class should also have a drive() method that prints out a generic message about vehicle's
    // top speed and a message saying that the vehicle is driving.
    // ("The vehicle can drive up to 80 mph and is currently driving")

    public void drive(){
        System.out.println("The vehicle can drive up to " + topSpeed + "  MPH and is currently driving");
    }
}
