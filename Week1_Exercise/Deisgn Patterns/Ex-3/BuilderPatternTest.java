public class BuilderPatternTest {
    public static void main(String[] args) {
        // Create a basic computer configuration
        Computer basicComputer = new Computer.Builder()
                .build();
        System.out.println("Basic Computer: " + basicComputer);

        // Create a gaming computer configuration
        Computer gamingComputer = new Computer.Builder()
                .withCpu("Intel Core i9")
                .withRam(16)
                .withStorage("1TB SSD")
                .withGraphicsCard()
                .build();
        System.out.println("Gaming Computer: " + gamingComputer);

        // Create a server computer configuration
        Computer serverComputer = new Computer.Builder()
                .withCpu("AMD Ryzen Threadripper")
                .withRam(32)
                .withStorage("2TB HDD")
                .build();
        System.out.println("Server Computer: " + serverComputer);
    }
}