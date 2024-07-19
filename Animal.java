package animals;

public class Animal {
	
	// Properties of the Animal class
    private String name;
    private String species;

    // Constructor to initialize the properties
    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    // Method to make a sound
    public void makeSound() {
        System.out.println("Animal sound");
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for species
    public String getSpecies() {
        return species;
    }

}
