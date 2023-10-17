public class TotalArea {
    public static void main(String[] args) {
        CircleWithPrivateDataFields[] circleArray;
        circleArray = createCircleArray();

        printCircleArray(circleArray);

    }
    public static CircleWithPrivateDataFields[] createCircleArray() {
        CircleWithPrivateDataFields[] circleArray = new CircleWithPrivateDataFields[5];

        for (int i = 0; i < circleArray.length; i++) {
            circleArray[i] = new CircleWithPrivateDataFields(Math.random() * 100);
           // System.out.println(circleArray);
        }
        return circleArray;

    }

    public static void printCircleArray(CircleWithPrivateDataFields[] circleArray) {
        System.out.println("Radius \t\t\t\t Area");
        for (int i = 0; i < circleArray.length ; i++) {
            System.out.println(circleArray[i].getRadius() + "\t" + circleArray[i].getArea());

        }
        System.out.println("-----------------------------------------------");

        System.out.println("The total area of circles is " + sum(circleArray));
    }

    private static double sum(CircleWithPrivateDataFields[] circleArray) {
        double sum = 0;
        for (int i = 0; i  < circleArray.length ; i++) {
            sum += circleArray[i].getArea();



        }
        return sum;
    }
}
