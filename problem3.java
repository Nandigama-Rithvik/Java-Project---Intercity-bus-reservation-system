import java.util.Scanner;

public class problem3 {
   static double calculateTotalWaste(double point1waste, double point2waste) {
        return point1waste + point2waste;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter waste collected at point1");
        double point1waste = sc.nextDouble();
        System.out.println("Enter waste collected at point2");
        double point2waste = sc.nextDouble();
        double totalWaste = calculateTotalWaste(point1waste, point2waste);
        System.out.println("Total waste collected: " + totalWaste + "kgs");
    }
}