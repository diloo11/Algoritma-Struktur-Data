package CaseStudy2;

public class Transaction {
    Vehicle vehicle;
    Gasoline gasoline;
    double liter;
    double totPayment;

    public Transaction(Vehicle vehicle, Gasoline gasoline, double liter, double totPayment) {
        this.vehicle = vehicle;
        this.gasoline = gasoline;
        this.liter = liter;
        this.totPayment = totPayment;
    }

    public void print() {
        System.out.println(vehicle.plateNum + " : Rp." + totPayment);
    }
}