package sellers;
import interior.*;
import cars.*;
import bridges.*;

// seller class with a facade, to hide the complexity of the car creation
public class Seller {
    public CarInterface orderCar(String interiorType, String engineType, String TiresType) {
        InteriorFactory interiorFactory;
        Engine engine;
        Tires tires;
        
        if(interiorType.toLowerCase().equals("classic")) {
            interiorFactory = new ClassicInteriorFactory();
        } else if(interiorType.toLowerCase().equals("modern")) {
            interiorFactory = new ModernInteriorFactory();
        } else {
            System.out.println("Invalid interior type");
            return null;
        }

        if(engineType.toLowerCase().equals("diesel")) {
            engine = new DieselEngine();
        } else if(engineType.toLowerCase().equals("electric")) {
            engine = new ElectricEngine();
        } else {
            System.out.println("Invalid engine type");
            return null;
        }

        if(TiresType.toLowerCase().equals("allseason")) {
            tires = new AllSeasonTires();
        } else if(TiresType.toLowerCase().equals("summer")) {
            tires = new SummerTires();
        } else {
            System.out.println("Invalid tires type");
            return null;
        }   

        CarInterface car = new SportsCar(
            engine,
            tires,
            interiorFactory.createCeiling(),
            interiorFactory.createUpholstery(),
            interiorFactory.createGloveCompartment(),
            true
        );
        return car;
    }
}