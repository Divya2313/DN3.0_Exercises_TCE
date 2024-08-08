public class Computer {
    private String cpu;
    private int ram;
    private String storage;
    private boolean isGraphicsCardEnabled;

    // Private constructor to prevent direct instantiation
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
    }

    // Static nested Builder class
    public static class Builder {
        private String cpu;
        private int ram;
        private String storage;
        private boolean isGraphicsCardEnabled;

        // Default values for attributes
        public Builder() {
            this.cpu = "Intel Core i3";
            this.ram = 8;
            this.storage = "256GB SSD";
            this.isGraphicsCardEnabled = false;
        }

        // Method to set CPU
        public Builder withCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        // Method to set RAM
        public Builder withRam(int ram) {
            this.ram = ram;
            return this;
        }

        // Method to set Storage
        public Builder withStorage(String storage) {
            this.storage = storage;
            return this;
        }

        // Method to enable Graphics Card
        public Builder withGraphicsCard() {
            this.isGraphicsCardEnabled = true;
            return this;
        }

        // build() method to create a Computer instance
        public Computer build() {
            return new Computer(this);
        }
    }

    // Getters for attributes
    public String getCpu() {
        return cpu;
    }

    public int getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", storage='" + storage + '\'' +
                ", isGraphicsCardEnabled=" + isGraphicsCardEnabled +
                '}';
    }
}\