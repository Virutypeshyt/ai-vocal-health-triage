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
    new Rule("yes", "yes", "Infection"),        // cough + fever
    new Rule("yes", "yes", "Vocal Strain")      // hoarseness + cough
};

boolean found = false;

if (rules[0].matches(cough, fever)) {
    System.out.println("Possible Condition: " + rules[0].result);
    System.out.println("Reason: cough + fever");
    found = true;
}
else if (rules[1].matches(hoarseness, cough)) {
    System.out.println("Possible Condition: " + rules[1].result);
    System.out.println("Reason: hoarseness + cough");
    found = true;
}

if (!found) {
    System.out.println("No major condition detected");
}
