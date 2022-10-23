package interior;
public class ClassicGloveCompartment implements GloveCompartment {
    private String openingMechanism;

    public void setOpeningMechanism(String openingMechanism) {
        this.openingMechanism = openingMechanism;
    }
    public String getOpeningMechanism() {
        return openingMechanism;
    } 

    public String getName() {
        return "Classic Glove Compartment";
    }
    public int getCapacity() {
        return 2;
    }
}