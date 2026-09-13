package builder;

public class AquariumDirector {
    public Aquarium constructStandardReef(AquariumBuilder builder) {
        return builder.setWaterType("Saltwater")
                .setCapacity(250)
                .setLighting("High-Intensity Blue LED")
                .setFilter("Protein Skimmer & Sump")
                .build();
    }
}