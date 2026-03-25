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

Rule[] rules = {
    new Rule("yes", "yes", "Infection"),
    new Rule("yes", "yes", "Vocal Strain")
};

boolean found = false;

for (Rule r : rules) {

    if (r.result.equals("Infection") && r.matches(cough, fever)) {
        System.out.println("Possible Condition: " + r.result);
        System.out.println("Reason: cough + fever");
        found = true;
        break;
    }

    if (r.result.equals("Vocal Strain") && r.matches(hoarseness, cough)) {
        System.out.println("Possible Condition: " + r.result);
        System.out.println("Reason: hoarseness + cough");
        found = true;
        break;
    }
}

if (!found) {
    System.out.println("No major condition detected");
}
