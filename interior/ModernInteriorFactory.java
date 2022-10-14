package interior;

public class ModernInteriorFactory implements InteriorFactory {
    public Tires createTires() {
        return new ModernTires();
    }
    public Furniture createFurniture() {
        return new ModernFurniture();
    }
    public Housing createHousing() {
        return new ModernHousing();
    }
}