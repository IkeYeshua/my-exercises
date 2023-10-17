public class CircleWithPrivateDataFields {
    private double radius = 1;

    private static int numberOfObjects = 0;

    public CircleWithPrivateDataFields() {
        numberOfObjects++;
    }

    public CircleWithPrivateDataFields(double newRadius) {
        setRadius(newRadius);
        numberOfObjects++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        //radius = (newRadius >= 1) ? newRadius : 0;
        if (newRadius >= 1)
            radius = newRadius;
        else
            radius = 0;

    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public static void printCircle(CircleWithPrivateDataFields c) {
        System.out.println("The area of the circle of radius "
                + c.getRadius() + " is " + c.getArea());
    }

    public static void printArea(CircleWithPrivateDataFields c, int times) {
        System.out.println("Radius \t\tArea");
        for (int i = 1; i <= times; i++) {
            System.out.println(c.getRadius() + "\t\t" + c.getArea());
            c.setRadius(c.getRadius() + 1);

        }


    }

    public static void printUpdatedRadius(CircleWithPrivateDataFields c, int n) {
        System.out.println("\n" + "Radius is " + c.getRadius());
        System.out.println("n is " + n);

    }
}