package oop_pracitce.task2;

public class Laptop extends Computers{
    private int diagonal;

    public Laptop(String brand, String model, String color, int year, String cpu, int memory, int diagonal) {
        super(brand, model, color, year, cpu, memory);
        this.diagonal = diagonal;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    @Override
    public void info(){
        super.info();
        System.out.println("Diagonal: " + diagonal);
    }

    public static void main(String[] args) {
        Laptop laptop = new Laptop("Apple", "Macbook pro", "Midnight", 2024, "M3", 128, 16);
        laptop.info();
    }
}
