package factories;

public class ClassicCeiling implements Ceiling {
    public String getCeilingMaterial() {
        return "Wood";
    }

    @Override
    public String getName() {
        return "Classic Ceiling";
    }

    @Override
    public String getColor() {
        return "Brown";
    }
}