import java.util.Scanner;

public class GasMileage {
    int miles = 0;
    int gallons = 0;
    double sum = 0;
    static int trips = 0;
    public static void main(String[] args) {
        GasMileage gasMileage = new GasMileage();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers oif trips");
        trips = scanner.nextInt();
        for (int i = 0; i < trips; ++i) {
            System.out.println("what is the mile: ");
            gasMileage.miles = scanner.nextInt();
            System.out.println("what is the gallon: ");
            gasMileage.gallons = scanner.nextInt();
            System.out.println();
            double milesPerGallonForEachTrip = (double) gasMileage.miles / gasMileage.gallons;
            gasMileage.sum += milesPerGallonForEachTrip;
            System.out.println(gasMileage.sum);
            System.out.println("The total miles per gallon for all trips is "+gasMileage.sum);
        }
        
    }


}
