package methods;

import java.util.Scanner;

public class InstantCreditCheck {
    static double requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();

        boolean qualified = isUserQualified( salary, creditScore);
        notifyUser(qualified);
    }

    public static void notifyUser(boolean qualified) {
        if (qualified) System.out.println("Congrats, you've been approved");
        else System.out.println("Sorry, you've been declined");
    }

    public static boolean isUserQualified(double salary, int creditScore) {
        return salary >= requiredSalary && creditScore >= requiredCreditScore;
    }

    public static double getSalary() {
        System.out.println("Enter your salary");
        return scanner.nextDouble();
    }

    public static int getCreditScore() {
        System.out.println("Enter your credit score");
        return scanner.nextInt();
    }
}
