package oop_pracitce.task2;

public class LoudSpeaker extends Sounds {
    private int volumeLevel;

    // Constructor
    public LoudSpeaker(String brand, String model, String color, int year, String name,  int volumeLevel) {
        super(brand, model, color, year, name);
        this.volumeLevel = volumeLevel;
    }

    // Getter for volume level
    public int getVolumeLevel() {
        return volumeLevel;
    }

    // Method to increase volume
    public void increaseVolume() {
        volumeLevel++;
        System.out.println("Increasing volume level to: " + volumeLevel);
    }
}

