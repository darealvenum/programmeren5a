package factories;

public class ModernInteriorFactory implements InteriorFactory {
    public GloveCompartment createGloveCompartment() {
        return new ModernGloveCompartment();
    }

    public Upholstery createUpholstery() {
        return new ModernUpholstery();
    }

    public Ceiling createCeiling() {
        return new ModernCeiling();
    }
}