
public class Vehicle {

    String ownerName;
    String vehicleType;

    static int registrationFee = 1000;

    Vehicle(String o, String v) {
        ownerName = o;
        vehicleType = v;
    }

    void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
        System.out.println();
    }

    static void updateRegistrationFee(int fee) {
        registrationFee = fee;
    }

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Shivani", "Car");
        Vehicle v2 = new Vehicle("Vanshi", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        updateRegistrationFee(1500);

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}