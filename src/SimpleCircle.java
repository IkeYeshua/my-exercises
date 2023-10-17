public class SimpleCircle {
   private   double radius;

    public SimpleCircle(){
        radius = 1;
    }
   public SimpleCircle(double newRadius){
        radius = newRadius;

    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
   public void setRadius(double newRadius) {
        radius = newRadius;
    }
}
