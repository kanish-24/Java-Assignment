package methodOverriding;

public class Main {
	
	// Main method to demonstrate method overriding
    public static void main(String[] args) {
        // Creating objects of Shape, Circle, and Square
        Shape shape = new Shape();
        Shape circle = new Circle();
        Shape square = new Square();

        // Calling the draw method on each object
        shape.draw();
        circle.draw();
        square.draw();
    }
	
}
