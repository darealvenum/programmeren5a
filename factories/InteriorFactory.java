package factories;

public interface InteriorFactory {
    public GloveCompartment createGloveCompartment();

    public Upholstery createUpholstery();

    public Ceiling createCeiling();
}