package oop_pracitce.task2;

public class Computers extends Electronics{
    private String cpu;
    private int memory;

    public Computers(String brand, String model, String color, int year, String cpu, int memory) {
        super(brand, model, color, year);
        this.cpu = cpu;
        this.memory = memory;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void info(){
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Color: " + getColor());
        System.out.println("Year: " + getYear());
        System.out.println("Cpu: " + getCpu());
        System.out.println("Memory: " + getMemory());
    }

    public static void main(String[] args) {
        Computers computers = new Computers("Apple", "Macbook Air", "Space Gray", 2022, "m2", 8);
        computers.info();
    }
}
