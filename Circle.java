package methodOverriding;

public class Circle extends Shape {
	
	// Overriding the draw method for Circle
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

}
