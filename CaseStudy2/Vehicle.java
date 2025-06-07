package CaseStudy2;

public class Vehicle {
    String plateNum;
    String type;
    String brand;

    public Vehicle(Vehicle vhc) {

    }

    public Vehicle(String plateNum, String type, String brand) {
        this.plateNum = plateNum;
        this.type = type;
        this.brand = brand;
    }

    void print() {
        System.out.println("Number Plate:" + plateNum);
        System.out.println("Type: " + type);
        System.out.println("Brand: " + brand);
    }

}
