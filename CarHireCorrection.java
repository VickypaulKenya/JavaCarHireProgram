import java.util.Scanner;

public class CarHireCorrection {
    private int vehicleID;
    private String status;
    private double dailyRate;
    private int noOfDaysRented;
    private String renterName;
    private String renterLicenseNumber; // Changed to String
    
    // Default constructor
    public CarHireCorrection() {
    }

    // Constructor with parameters
    public CarHireCorrection(int vehicleID, double dailyRate) {
        this.vehicleID = vehicleID;
        this.dailyRate = dailyRate;
        status = "A"; // Set initial status to "A"
    }

    public void setStatus(String status) {
        this.status = status; // Set class variable
    }

    public String getStatus() {
        return status;
    }

    public void setVehicleID(int vehicleID) {
        this.vehicleID = vehicleID; // Set class variable
    }

    public int getVehicleID() {
        return vehicleID;
    }

    public boolean rent() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        renterName = input.nextLine();
        System.out.println("Enter License Number");
        renterLicenseNumber = input.nextLine(); // Changed variable type
        System.out.println("Number of Days Rented");
        noOfDaysRented = input.nextInt(); // Changed variable type

        System.out.println("Status");
        status = input.next(); // Changed to input.next() to read a single word

        if (status.equals("A")) { // Use .equals() for string comparison
            status = "O";
            System.out.println("Renter name: " + renterName);
            System.out.println("License NO: " + renterLicenseNumber);
            System.out.println("Number of Days: " + noOfDaysRented);
            return true; // Return true if rented successfully
        } else {
            return false;
        }
    }

    public boolean returnBack() {
        if (status.equals("O")) {
            double charges;
            charges = noOfDaysRented * dailyRate;
            System.out.println("Charges: " + charges);
            return true; // Return true if returned successfully
        } else {
            return false;
        }
    }

    // Main method
    public static void main(String[] args) {
        CarHireCorrection car = new CarHireCorrection(123, 50.0); // Example usage
        car.rent();
        car.returnBack();
    }
}
