package Question04;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        Shape square = ShapeFactory.getShape("SQUARE");
        square.draw();
    }
}
