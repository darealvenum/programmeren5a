package sellers;

import java.util.List;

import builders.*;
import cars.*;

// seller class with a facade, to hide the complexity of the car creation
public class Seller {
    public Car orderCar(
            String carType,
            String interiorType,
            String engineType,
            String TiresType,
            List<DecoratorType> decorators) {
        AbstractCarBuilder builder = carType.equals("sport") ? new SportsCarBuilder() : new SedanCarBuilder();
        builder.setInterior(interiorType);
        builder.setEngine(engineType);
        builder.setTires(TiresType);
        builder.assemble();
        for (DecoratorType decorator : decorators) {
            builder.addDecorator(decorator);
        }
        return builder.build();

    }
}