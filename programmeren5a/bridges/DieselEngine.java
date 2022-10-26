package bridges;

public class DieselEngine implements Engine {
    private int maxCapacity;

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void start() {
        System.out.println("Diesel engine started with max capacity " + maxCapacity);
    }
    public void stop() {
        System.out.println("Diesel engine stopped");
    }
}