package factories;

public class ClassicUpholstery implements Upholstery {
    private int targetEra;

    public void setTargetEra(int targetEra) {
        this.targetEra = targetEra;
    }

    public String getName() {
        return "Classic Upholstery";
    }

    public String getColor() {
        return "Black";
    }

    public int getTargetEra() {
        return targetEra;
    }
    
}
