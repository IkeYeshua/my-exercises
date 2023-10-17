import java.awt.*;

public class TestTheRectangle {
    public static void main(String[] args) {
        TheRectangle rectangle1 = new TheRectangle(4, 5);
        TheRectangle rectangle2 = new TheRectangle(3.5,35.9);
        TheRectangle.print(rectangle1);
        TheRectangle.printAnother(rectangle2);

    }
}
