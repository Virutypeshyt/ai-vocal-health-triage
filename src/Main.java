import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Vocal Health Check ===");
        System.out.println("Describe your symptoms (e.g., I have cough and fever):");

        String input = sc.nextLine().toLowerCase();

        String hoarseness = "no";
        String cough = "no";
        String fever = "no";

        if (input.contains("hoarseness")) hoarseness = "yes";
        if (input.contains("cough")) cough = "yes";
        if (input.contains("fever")) fever = "yes";

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

        sc.close();
    }
}
