package builder;

public interface AquariumBuilder {
    AquariumBuilder setWaterType(String type);
    AquariumBuilder setCapacity(int liters);
    AquariumBuilder setLighting(String lighting);
    AquariumBuilder setFilter(String filter);
    Aquarium build();
}