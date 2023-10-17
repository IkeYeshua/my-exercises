

public class TheRectangle {
    private  double width;

    private double height;

    public TheRectangle(){};
    public TheRectangle(double newWidth,double newHeight) {
        this.width = newWidth;
        this.height = newHeight;

    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return getWidth() * getHeight();
    }

    public double getPerimeter(){
        return 2 * (getWidth() * getHeight());
    }

    public static void print(TheRectangle r) {
        System.out.println("The width: " + r.getWidth()  + "," + "The Height: "
                + r.getHeight() + "," + "The area of the rectangle is "  + r.getArea() +"." +
                "The perimeter of a rectangle " + r.getPerimeter() +"." );
    }

    public static void printAnother(TheRectangle r) {
        System.out.println("The width: " + r.getWidth()  + "," + "The Height: "
                + r.getHeight() + "," + "The area of the rectangle is "  + r.getArea() +"." +
                "The perimeter of a rectangle " + r.getPerimeter() +"." );
    }

    }

