package interior;

public class ModernCeiling implements Ceiling {

    private String skyLightColor;

    public void setSkyLightColor(String skyLightColor) {
        this.skyLightColor = skyLightColor;
    }

    public String getSkyLightColor() {
        return skyLightColor;
    }
    
    public String getName() {
        return "Modern Ceiling";
    }

    public String getColor() {
        return "White";
    }
}