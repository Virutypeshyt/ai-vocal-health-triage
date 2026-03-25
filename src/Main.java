import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Vocal Health Check ===");

        System.out.print("Do you have hoarseness? (yes/no): ");
        String hoarseness = sc.nextLine();

        System.out.print("Do you have cough? (yes/no): ");
        String cough = sc.nextLine();

        System.out.print("Do you have fever? (yes/no): ");
        String fever = sc.nextLine();

        System.out.println("\nInput received:");
        System.out.println("Hoarseness: " + hoarseness);
        System.out.println("Cough: " + cough);
        System.out.println("Fever: " + fever);

        sc.close();
    }
}
