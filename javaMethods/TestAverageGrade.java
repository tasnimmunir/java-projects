import java.util.Scanner;
public class TestAverageGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Test score 1: ");
        int score1 = input.nextInt();
        System.out.println("Your Grade is: " + determineGrade(score1));
        System.out.println("Enter Your Test score 2: ");
        int score2 = input.nextInt();
        System.out.println("Your Grade is: " + determineGrade(score2));
        System.out.println("Enter Your Test score 3: ");
        int score3 = input.nextInt();
        System.out.println("Your Grade is: " + determineGrade(score3));
        System.out.println("Enter Your Test score 4: ");
        int score4 = input.nextInt();
        System.out.println("Your Grade is: " + determineGrade(score4));
        System.out.println("Enter Your Test score 5: ");
        int score5 = input.nextInt();
        System.out.println("Your Grade is: " + determineGrade(score5));

        System.out.println("Your Average Grade is: " + calcAverage( score1, score2, score3, score4, score5));
    }
    public static double calcAverage(int sc1, int sc2, int sc3, int sc4, int sc5){
        double gradeCounter = 5.0;
        double average = (sc1 + sc2 + sc3 + sc4 + sc5)/ gradeCounter;
        return average;
    }
    public static String determineGrade(int testGrade) {
        String grade = " ";
        if (testGrade >= 90 && testGrade <= 100) {
            grade = "A";
            return grade;
        }
        else if (testGrade >= 80 && testGrade <= 89) {
            grade = "B";
            return grade;
        }
        else if (testGrade >= 70 && testGrade <= 79) {
            grade = "C";
            return grade;
        }
        else if (testGrade >= 60 && testGrade <= 69) {
            grade = "D";
            return grade;
        }
        else
        {
            grade = "F";
            return grade;
        }

    }
}
