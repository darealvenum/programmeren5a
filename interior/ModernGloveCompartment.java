package interior;

public class ModernGloveCompartment implements GloveCompartment {
    private int capacity;

    public void setCapacity(int capacity) {
        if (capacity < 0) {
            this.capacity = 0;
        } else if (capacity > 6) {
            this.capacity = 6;
        } else {
            this.capacity = capacity;
        }
    }

    public String getName() {
        return "Modern Glove Compartment";
    }
    
    public int getCapacity() {
        return capacity;
    }
}