public class TestCircleWithPrivateDataFields {
    public static void main(String[] args) {
        CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields();
        //System.out.println("The area of the circle of radius "
               // + myCircle.getRadius() + " is " + myCircle.getArea());
       // myCircle.setRadius(myCircle.getRadius() * 1.1);
       // System.out.println("The area of the circle of radius "
            //    + myCircle.getRadius() + " is " + myCircle.getArea());
        //System.out.println(CicleWithPrivateDataFields.getNumberOfObjects());
        int n = 5;
        CircleWithPrivateDataFields.printCircle(myCircle);
        CircleWithPrivateDataFields.printArea(myCircle, n);
        CircleWithPrivateDataFields.printUpdatedRadius(myCircle , n);

    }


}
