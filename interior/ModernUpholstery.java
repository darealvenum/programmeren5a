package interior;

public class ModernUpholstery implements Upholstery {
    private String fabric;

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public String getName() {
        return "Modern Upholstery";
    }
    
    public String getColor() {
        return "Black";
    }

    public String getFabric() {
        return fabric;
    }
}