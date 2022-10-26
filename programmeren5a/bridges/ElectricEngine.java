package bridges;

public class ElectricEngine implements Engine {
    public void start() {
        System.out.println("Electric engine started");
    }
    public void stop() {
        System.out.println("Electric engine stopped");
    }
}