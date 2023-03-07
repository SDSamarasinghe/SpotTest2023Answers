package Question04;

public class Triangle implements Shape {
    @Override
    public void draw() {

        System.out.println("Inside Triangle::draw() method");
        System.out.println("    *    ");
        System.out.println("   ***   ");
        System.out.println("  *****  ");
        System.out.println(" ******* ");
        System.out.println("*********");

    }
}
