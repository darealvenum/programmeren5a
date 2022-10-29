package factories;

public class ModernCeiling implements Ceiling {


    public String getName() {
        return "Modern Ceiling (with sky light)";
    }

    public String getColor() {
        return "White";
    }

    @Override
    public int getPrice() {
        return 1000;
    }
}