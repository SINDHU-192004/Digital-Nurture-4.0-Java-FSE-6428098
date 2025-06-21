// Main.java
public class Main {
    public static void main(String[] args) {
        // Basic computer with only CPU and RAM
        Computer basicComputer = new Computer.Builder("Intel i3", "4GB").build();
        basicComputer.displayConfig();

        // Gaming computer with full configuration
        Computer gamingPC = new Computer.Builder("Intel i9", "32GB")
                                .setStorage("1TB SSD")
                                .setGraphicsCard("NVIDIA RTX 4080")
                                .setOperatingSystem("Windows 11 Pro")
                                .build();
        gamingPC.displayConfig();

        // Office laptop
        Computer officeLaptop = new Computer.Builder("AMD Ryzen 5", "8GB")
                                .setStorage("512GB SSD")
                                .setOperatingSystem("Windows 10")
                                .build();
        officeLaptop.displayConfig();
    }
}
