package interior;

public class VictorianInteriorFactory implements InteriorFactory {
    public Furniture createFurniture() {
        return new VictorianFurniture();
    }
    public Tires createTires() {
        return new VictorianTires();
    }
    public Housing createHousing() {
        return new VictorianHousing();
    }
}