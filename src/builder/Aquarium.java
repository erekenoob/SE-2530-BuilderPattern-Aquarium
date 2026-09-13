package builder;

public class Aquarium {
    private String waterType;
    private int capacityLiters;
    private String lightingSystem;
    private String filterType;

    public Aquarium(String waterType, int capacityLiters, String lightingSystem, String filterType) {
        this.waterType = waterType;
        this.capacityLiters = capacityLiters;
        this.lightingSystem = lightingSystem;
        this.filterType = filterType;
    }

    @Override
    public String toString() {
        return "Aquarium [" + capacityLiters + "L, " + waterType + " water, Filter: " + filterType + ", Light: " + lightingSystem + "]";
    }
}