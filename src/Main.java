import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Vocal Health Check ===");

        System.out.print("Do you have hoarseness? (yes/no): ");
        String hoarseness = sc.nextLine().toLowerCase();

        System.out.print("Do you have cough? (yes/no): ");
        String cough = sc.nextLine().toLowerCase();

        System.out.print("Do you have fever? (yes/no): ");
        String fever = sc.nextLine().toLowerCase();

System.out.println("\n--- Diagnosis ---");


if (cough.equals("yes") && fever.equals("yes")) {
    System.out.println("Possible Condition: Infection");
    System.out.println("Reason: cough + fever detected");
}
else if (hoarseness.equals("yes") && cough.equals("yes")) {
    System.out.println("Possible Condition: Vocal Strain");
    System.out.println("Reason: hoarseness + cough detected");
}
else if (hoarseness.equals("yes")) {
    System.out.println("Possible Condition: Mild Voice Issue");
    System.out.println("Reason: hoarseness detected");
}
else {
    System.out.println("No major condition detected");
}
