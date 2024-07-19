package animals;

public class Dog extends Animal {
	
	// Additional property of the Dog class
    private String breed;

    // Constructor to initialize the properties
    public Dog(String name, String species, String breed) {
        // Call the constructor of the superclass
        super(name, species);
        this.breed = breed;
    }

    // Override the makeSound method
    @Override
    public void makeSound() {
        // Call the makeSound method of the superclass
        super.makeSound();
        System.out.println("Bark");
    }

    // Getter for breed
    public String getBreed() {
        return breed;
    }

    // Method to display dog details
    public void displayDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Species: " + getSpecies());
        System.out.println("Breed: " + breed);
    }
	

}
