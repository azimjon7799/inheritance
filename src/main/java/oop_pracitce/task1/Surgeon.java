package oop_pracitce.task1;

public class Surgeon extends Doctor {
    private int numberOfSurgeriesPerformed;

    public Surgeon(String name, int age, String specialty, String licenseNumber, int numberOfSurgeriesPerformed) {
        super(name, age, specialty, licenseNumber);
        this.numberOfSurgeriesPerformed = numberOfSurgeriesPerformed;
    }

    public int getNumberOfSurgeriesPerformed() {
        return numberOfSurgeriesPerformed;
    }

    public void setNumberOfSurgeriesPerformed(int numberOfSurgeriesPerformed) {
        if (numberOfSurgeriesPerformed >= 0) {
            this.numberOfSurgeriesPerformed = numberOfSurgeriesPerformed;
        } else {
            System.out.println("Number of surgeries performed must be non-negative.");
        }
    }

    public void displayInfo(){
        System.out.println("Surgeon name: " + getName());
        System.out.println("Surgeon age: " + getAge());
        System.out.println("Surgeon specialty: " + getSpecialty());
        System.out.println("Surgeon license number: " + getLicenseNumber());
        System.out.println("Number of surgeries performed: " + getNumberOfSurgeriesPerformed());
    }

    public static void main(String[] args) {
        Surgeon surgeon = new Surgeon("Doctor D", 50, "Cardiothoracic Surgery", "ABC123456", 250);
        surgeon.displayInfo();
    }


}
