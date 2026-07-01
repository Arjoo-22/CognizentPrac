public class BuilderPatternTest {

    public static void main(String[] args) {

        Computer c1 = new Computer.Builder()
                .setCPU("Intel i5")
                .setRAM(16)
                .setStorage(512)
                .build();

        Computer c2 = new Computer.Builder()
                .setCPU("Ryzen 7")
                .setRAM(32)
                .setStorage(1000)
                .build();

        System.out.println("Computer 1");
        c1.display();

        System.out.println();

        System.out.println("Computer 2");
        c2.display();
    }
}