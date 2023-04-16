package AdvancedEx8;

public class FIsh extends Animal{
    String species;
    public FIsh(double height, double weight, String species) {
        super(height, weight);
        this.species=species;
    }
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
    public double swimSpeedMetersPerSecond(){
        return getWeight()*2;
    }

}
