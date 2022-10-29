package bridges;

public class DieselEngine implements Engine {
    private int maxCapacity = 70;

    public void setMaxCapacity(int maxCapacity) {
        if (maxCapacity < 70) {
            this.maxCapacity = 70;
        } else if (maxCapacity > 200) {
            this.maxCapacity = 200;
        } else {
            this.maxCapacity = maxCapacity;
        }
    }

    public void start() {
        System.out.println("Diesel engine started with max capacity " + maxCapacity);
    }

    public void stop() {
        System.out.println("Diesel engine stopped");
    }

    public int getPrice() {
        return 500;
    }
}