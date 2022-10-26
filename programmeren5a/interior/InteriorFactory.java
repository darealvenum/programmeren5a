package interior;

public interface InteriorFactory {
    public GloveCompartment createGloveCompartment();
    public Upholstery createUpholstery();
    public Ceiling createCeiling();
}