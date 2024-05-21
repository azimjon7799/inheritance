package oop_pracitce.task1;

public class Lor extends Doctor {
    private String clinicName;

    public Lor(String name, int age, String specialty, String licenseNumber, String clinicName) {
        super(name, age, specialty, licenseNumber);
        this.clinicName = clinicName;
    }

    public String getClinicName() {
        return clinicName;
    }

    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }

    public static void main(String[] args) {
        Lor lor = new Lor("Doctor D", 50, "Ginokologiya", "XYZ987654", "Doctor D clinic");
        lor.displayInfo();
    }
    public void displayInfo(){
        System.out.println("Name: " + this.getName());
        System.out.println("Age: " + this.getAge());
        System.out.println("Specialty: " + this.getSpecialty());
        System.out.println("License Number: " + this.getLicenseNumber());
        System.out.println("Clinic Name: " + this.getClinicName());
    }
}

