import java.util.*;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        while (true) {
            System.out.println("=== Welcome to BMI Calculator ===");
            System.out.println();


            System.out.print("Enter your weight(KG): ");
            double weight = sc.nextDouble();
            System.out.print("Enter your height(Meter, e.g: 1.75): ");
            double height = sc.nextDouble();

            double BMI = weight / Math.pow(height, 2);

            System.out.println();

            if (BMI < 18.5) {
                System.out.printf("Weak, Your BMI --- %.2f ---", BMI);
            } else if (BMI >= 18.5 && BMI < 25) {
                System.out.printf("Normal, Your BMI --- %.2f ---", BMI);
            } else if (BMI >= 25) {
                System.out.printf("Heavy, Your BMI --- %.2f ---", BMI);
            }
            System.out.println();
            System.out.println();

            System.out.print("Calculate again? (y/n): ");
            String answer = sc.next();

            System.out.println();

            if (answer.equalsIgnoreCase("n")) {
                System.out.println("Goodbye!");
                break;
            }
        }
    }
}
