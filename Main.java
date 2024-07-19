package animals;

public class Main {
	
	 // Main method to demonstrate the use of super keyword
    public static void main(String[] args) {
        // Creating an object of the Dog class
        Dog dog = new Dog("Buddy", "Canine", "Golden Retriever");

        // Displaying the details of the dog
        dog.displayDetails();

        // Making the dog sound
        dog.makeSound();
    }

}
