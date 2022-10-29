package bridges;

public class SummerTires implements Tires {
    public void start() {
        System.out.println("Starting Summer Tires");
    }

    public void stop() {
        System.out.println("Stopping Summer Tires");
    }

    public int getPrice() {
        return 300;
    }
}