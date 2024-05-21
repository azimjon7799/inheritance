package oop_pracitce.task2;

public class Subwoofer extends Sounds {
    private int bassLevel;

    // Constructor
    public Subwoofer(String brand, String model, String color, int year, String name, int bassLevel) {
        super(brand, model, color, year, name);
        this.bassLevel = bassLevel;
    }

    public int getBassLevel() {
        return bassLevel;
    }

    public void setBassLevel(int bassLevel) {
        this.bassLevel = bassLevel;
    }
}

