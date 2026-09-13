package builder;

public class Main {
    public static void main(String[] args) {
        AquariumDirector director = new AquariumDirector();

        System.out.println("--- Building Marine Reef ---");
        AquariumBuilder reefBuilder = new ReefMarineBuilder();
        Aquarium reefTank = director.constructStandardReef(reefBuilder);
        System.out.println(reefTank);

        System.out.println("\n--- Building Custom Planted Tank ---");
        Aquarium plantedTank = new PlantedFreshwaterBuilder()
                .setWaterType("Freshwater")
                .setCapacity(60)
                .setLighting("RGB Spectrum LED")
                .setFilter("Canister Filter")
                .build();
        System.out.println(plantedTank);
    }
}