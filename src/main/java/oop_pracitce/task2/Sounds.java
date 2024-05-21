package oop_pracitce.task2;

public class Sounds extends Electronics {
    private String name;

    // Constructor
    public Sounds(String brand, String model, String color, int year, String name) {
        super(brand, model, color, year);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void info(){
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Color: " + getColor());
        System.out.println("Year: " + getYear());
    }

    public static void main(String[] args) {
        Sounds sounds = new Sounds("Sony", "SWX-1000", "Black", 2023, "Sony");
        sounds.info();
    }
}

