package bridges;

public class AllSeasonTires implements Tires {
    public void start() {
        System.out.println("Starting All Season Tires");
    }

    public void stop() {
        System.out.println("Stopping All Season Tires");
    }

    public int getPrice() {
        return 400;
    }
}