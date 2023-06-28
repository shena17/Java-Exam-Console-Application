import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    private static String name;
    private static int age;
    private static int candNum;
    private static int score = 0;

    public static void main(String[] args) {

        System.out.println("\n\tWELCOME TO THE CAMBRIDGE ASSESSMENT PAPER\n");

        Scanner scan = new Scanner(System.in);

        System.out.println("\tPlease fill the details below.");
        try {
            System.out.print("Enter your name :- ");
            name = scan.nextLine().trim();

            System.out.print("Enter your age :- ");
            age = scan.nextInt();

            System.out.print("Enter the candidate number :- ");
            candNum = scan.nextInt();

        } catch (InputMismatchException ex) {
            System.out.println(
                    "You have entered false information!\nYou have entered invalid characters in the fields.\n");
            System.exit(0);
        } catch (Exception ex) {
            System.out.println("Error :- " + ex.toString());
        }

        System.out.println("You will begin the test now!\n\tGOOD LUCK!\n");

        // QUESTIONS

        // Change the question and the answer the way you want
        String q1 = "Who is the president?\n(a) Obama\n(b) Trump\n(c) Biden";

        String q2 = "Who is the president?\n(a) Obama\n(b) Trump\n(c) Biden";

        String q3 = "Who is the president?\n(a) Obama\n(b) Trump\n(c) Biden";

        String q4 = "Who is the president?\n(a) Obama\n(b) Trump\n(c) Biden";

        String q5 = "Who is the president?\n(a) Obama\n(b) Trump\n(c) Biden";

        Questions[] test = {
                new Questions(q1, 'c'),
                new Questions(q2, 'c'),
                new Questions(q3, 'c'),
                new Questions(q4, 'c'),
                new Questions(q5, 'c')

        };

        method(test);

        scan.close();
    }

    public static void method(Questions[] test) {

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i].prompt);
            char ans = scan.next().charAt(0);
            if (ans == test[i].answer) {
                score++;
            }
        }

        System.out.println("You scored " + score + " /5\n");
        System.out.println("Do you want to display the printout?");
        System.out.print("y / n --> ");
        char exit = scan.next().charAt(0);
        if (exit == 'y') {
            end();
        } else {
            System.exit(0);
        }

        scan.close();

    }

    public static void end() {
        System.out.println("\n\tRESULTS\n");

        System.out.println("Candidate name -----> " + name + "     Candidate number (" + candNum + ")\n");
        System.out.println("Candidate age ------> " + age + "\n");
        System.out.println("Candidate college --> Cambridge");
        System.out.println("Candidate score ----> " + score + "/5\n");
    }

}