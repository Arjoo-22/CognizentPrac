class Computer {

    String CPU;
    int RAM;
    int Storage;

    // Private constructor
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.Storage = builder.Storage;
    }

    // Display method
    void display() {
        System.out.println("CPU: " + CPU);
        System.out.println("RAM: " + RAM + " GB");
        System.out.println("Storage: " + Storage + " GB");
    }

    // Builder class
    static class Builder {

        String CPU;
        int RAM;
        int Storage;

        // Methods for setting values
        Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        Builder setRAM(int RAM) {
            this.RAM = RAM;
            return this;
        }

        Builder setStorage(int Storage) {
            this.Storage = Storage;
            return this;
        }

        // Build method
        Computer build() {
            return new Computer(this);
        }
    }
}