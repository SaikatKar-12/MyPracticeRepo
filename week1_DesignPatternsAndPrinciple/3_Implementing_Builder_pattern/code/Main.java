public class Main {
    public static void main(String[] args) {
        Computer gamingPc = new Computer.Builder()
            .setCpu("Intel i9")
            .setRam("32GB")
            .setStorage("1TB SSD")
            .setGraphicsCard("NVIDIA RTX 4080")
            .build();

        Computer officePc = new Computer.Builder()
            .setCpu("Intel i5")
            .setRam("8GB")
            .setStorage("512GB SSD")
            .build();

        System.out.println(gamingPc);
        System.out.println(officePc);
    }
}
