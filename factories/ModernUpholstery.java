package factories;

public class ModernUpholstery implements Upholstery {

    public String getName() {
        return "Modern Upholstery";
    }
    
    public String getColor() {
        return "Black";
    }

    public String getFabric() {
        return "Leather" ;
    }

    public int getPrice() {
        return 500;
    }
}