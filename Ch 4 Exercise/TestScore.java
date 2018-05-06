import java.util.Scanner;

public class TestScore {


    public static void main(String[] args) {
        // display operational messages
        System.out.println("Please enter test scores that range from 0 to 100.");
        System.out.println("To end the program enter 999.");
        System.out.println();  // print a blank line

        // initialize variables and create a Scanner object
        int scoreTotal = 0;
        int scoreCount = 0;
        int testScore = 0;
        Scanner sc = new Scanner(System.in);

        Scanner continueTest = new Scanner(System.in);
        String numTestScores = "y";

        // get a series of test scores from the user
        do {
            scoreCount = 0;
            System.out.print("Enter the number of test scores to be entered: ");
            scoreCount = sc.nextInt();

            // get the input from the user
            for (int i = 1; i <= scoreCount; i += 1) {
                System.out.print("Enter score: ");
                testScore = sc.nextInt();

                // accumulate score count and score total
                if (testScore <= 100) {
                    scoreTotal += testScore;
                } else {
                    System.out.println("Invalid entry, not counted");
                    i -= 1;
                }
            }

            // display the score count, score total, and average score
            double averageScore = scoreTotal / scoreCount;
            String message = "\n"
                    + "Score count:   " + scoreCount + "\n"
                    + "Score total:   " + scoreTotal + "\n"
                    + "Average score: " + averageScore + "\n";
            System.out.println(message);
            System.out.println("Enter more test scores? (y/n):");
            numTestScores = continueTest.next();
        }
        while (numTestScores.equalsIgnoreCase("Y"));
    }
}