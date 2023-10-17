public class TestSimpleCircle {
    public static void main(String[] args) {
        SimpleCircle simpleCircle = new SimpleCircle();
        System.out.println("The area of the circle of radius " + simpleCircle.getRadius()
                + " is " + simpleCircle.getArea());
        SimpleCircle simpleCircle1 = new SimpleCircle(25);
        System.out.println("The area of the circle of radius " + simpleCircle.getRadius() +
                "is " + simpleCircle1.getArea());
        simpleCircle1.setRadius(100);
        System.out.println("The area of the circle of radius " + simpleCircle1.getRadius()
        + " is " + simpleCircle1.getArea());

    }


}
