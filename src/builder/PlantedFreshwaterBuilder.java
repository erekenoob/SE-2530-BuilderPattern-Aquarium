package builder;

public class PlantedFreshwaterBuilder implements AquariumBuilder {
    private String waterType;
    private int capacityLiters;
    private String lightingSystem;
    private String filterType;

    @Override
    public AquariumBuilder setWaterType(String type) { this.waterType = type; return this; }

    @Override
    public AquariumBuilder setCapacity(int liters) { this.capacityLiters = liters; return this; }

    @Override
    public AquariumBuilder setLighting(String lighting) { this.lightingSystem = lighting; return this; }

    @Override
    public AquariumBuilder setFilter(String filter) { this.filterType = filter; return this; }

    @Override
    public Aquarium build() {
        if (capacityLiters <= 0) {
            throw new IllegalStateException("Capacity must be positive!");
        }
        return new Aquarium(waterType, capacityLiters, lightingSystem, filterType);
    }
}