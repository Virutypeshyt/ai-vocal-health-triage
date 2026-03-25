class Rule {
    String symptom1;
    String symptom2;
    String result;

    Rule(String s1, String s2, String result) {
        this.symptom1 = s1;
        this.symptom2 = s2;
        this.result = result;
    }

    boolean matches(String input1, String input2) {
        return input1.equals(symptom1) && input2.equals(symptom2);
    }
}
