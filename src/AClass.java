public class AClass {
    private double radius = 1;
    String s = "Nneka";
    boolean x;
   // AClass(String newS) {
      //  s = newS;
   // }

   // public void print() {
       // System.out.println(s);
    //}
    public double getRadius() {
        return radius;
    }
      public double getArea() {
          return radius * radius * Math.PI;
      }

    public static void main(String[] args) {
        AClass aClass = new AClass();
        System.out.println(aClass.getRadius());
    }

}
