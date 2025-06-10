package EightQuestions;
public class SimpleInterest {
    public static void main(String[] args) {
        double principal = 10000;  // Hardcoded Principal amount
        double rate = 5.5;         // Hardcoded Interest Rate
        double time = 2;           // Hardcoded Time in years

        double interest = (principal * rate * time) / 100;

        System.out.println("Simple Interest: " + interest);
    }
}
