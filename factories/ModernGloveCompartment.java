package factories;

public class ModernGloveCompartment implements GloveCompartment {

    public String getName() {
        return "Modern Glove Compartment (with usb)";
    }

    public int getCapacity() {
        return 7;
    }

    public int getPrice() {
        return 400;
    }
}