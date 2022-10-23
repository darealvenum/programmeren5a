package interior;

public class ClassicInterriorFactory implements InteriorFactory {
    public GloveCompartment createGloveCompartment() {
        return new ClassicGloveCompartment();
    }
   
    public Upholstery createUpholstery() {
        return new ClassicUpholstery();
    }
   
    public Ceiling createCeiling() {
        return new ClassicCeiling();
    }
}