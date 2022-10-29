package sellers;

import java.util.List;
import java.util.Optional;

import builders.*;
import cars.*;

// seller class with a facade, to hide the complexity of the car creation
public class Seller {
    public Car orderCar(
            String carType,
            String interiorType,
            String engineType,
            String TiresType,
            List<DecoratorType> decorators
            ) {
        AbstractCarBuilder builder;
        switch (carType) {
            case "sedan":
                builder = new SedanCarBuilder();
                break;
            case "sports":
                builder = new SportsCarBuilder();
                break;
            default:
                throw new IllegalArgumentException("Invalid car type");
        }
        builder.setInterior(interiorType);
        builder.setEngine(engineType);
        builder.setTires(TiresType);

        if (carType.equals("sport")) {
            System.out.println("Do you want turbo? (y/else)");
            String turbo = System.console().readLine();
            if (turbo.equals("y")) {
                ((SportsCarBuilder) builder).setTurbo(true);
            }
        
        }

        if(engineType.equals("diesel")) {
            System.out.println("What is the engine capacity?");
            int engineCapacity = Integer.parseInt(System.console().readLine());
            builder.setEngineCapacity(engineCapacity);
        }

        
        if(carType.equals("sedan")) {
            System.out.println("How many seats?");
            int numSeats = Integer.parseInt(System.console().readLine());
            ((SedanCarBuilder) builder).setNumSeats(numSeats);
        }

        builder.assemble();


        for (DecoratorType decorator : decorators) {
            builder.addDecorator(decorator);
        }
        return builder.build();

    }
}