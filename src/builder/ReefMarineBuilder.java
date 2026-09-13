package builder;

public class ReefMarineBuilder implements AquariumBuilder {
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
        if (capacityLiters < 100) {
            throw new IllegalStateException("Marine aquariums must be at least 100 liters!");
        }
        return new Aquarium(waterType, capacityLiters, lightingSystem, filterType);
    }
}