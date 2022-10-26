package sellers;

import bridges.AllSeasonTires;
import bridges.DieselEngine;
import bridges.ElectricEngine;
import bridges.Engine;
import bridges.SummerTires;
import bridges.Tires;
import cars.Car;
import cars.SportsCar;
import interior.ClassicInteriorFactory;
import interior.InteriorFactory;
import interior.ModernInteriorFactory;

// seller class with a facade, to hide the complexity of the car creation
public class Seller {
    public Car orderCar(String interiorType, String engineType, String TiresType) {
        InteriorFactory interiorFactory;
        Engine engine;
        Tires tires;

        if (interiorType.equalsIgnoreCase("classic")) {
            interiorFactory = new ClassicInteriorFactory();
        } else if (interiorType.equalsIgnoreCase("modern")) {
            interiorFactory = new ModernInteriorFactory();
        } else {
            System.out.println("Invalid interior type");
            return null;
        }

        if (engineType.equalsIgnoreCase("diesel")) {
            engine = new DieselEngine();
        } else if (engineType.equalsIgnoreCase("electric")) {
            engine = new ElectricEngine();
        } else {
            System.out.println("Invalid engine type");
            return null;
        }

        if (TiresType.equalsIgnoreCase("allseason")) {
            tires = new AllSeasonTires();
        } else if (TiresType.equalsIgnoreCase("summer")) {
            tires = new SummerTires();
        } else {
            System.out.println("Invalid tires type");
            return null;
        }

        Car car = new SportsCar(
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