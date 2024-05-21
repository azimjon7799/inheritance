package oop_pracitce.task2;

public class PC extends Computers{
   private int diagonalOfMonitor;
   private String brandOfMonitor;

    public PC(String brand, String model, String color, int year, String cpu, int memory, String brandOfMonitor, int diagonalOfMonitor) {
        super(brand, model, color, year, cpu, memory);
        this.brandOfMonitor = brandOfMonitor;
        this.diagonalOfMonitor = diagonalOfMonitor;
    }

    public String getBrandOfMonitor() {
        return brandOfMonitor;
    }

    public void setBrandOfMonitor(String brandOfMonitor) {
        this.brandOfMonitor = brandOfMonitor;
    }

    public int getDiagonalOfMonitor() {
        return diagonalOfMonitor;
    }

    public void setDiagonalOfMonitor(int diagonalOfMonitor) {
        this.diagonalOfMonitor = diagonalOfMonitor;
    }

    @Override // qo'shimcha o'rganib, foydalandim.
    public void info(){
        super.info();
        System.out.println("Brand of Monitor: " + brandOfMonitor);
        System.out.println("Diagonal of monitor: " + diagonalOfMonitor);
    }

    public static void main(String[] args) {
        PC pc = new PC("Apple", "iMac", "Gray", 2024, "m3", 32, "Apple", 27);
        pc.info();
    }
}
