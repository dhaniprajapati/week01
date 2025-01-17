import java.util.Random;

public class StudentResultCard {

    // Method to generate random 2-digit scores
    public static int[][] generateScores(int numberOfStudents) {
        Random rand = new Random();
        int[][] scores = new int[numberOfStudents][3];  // create a 2D array to store scores for each student and subject
        // run loop through each student
        for (int i = 0; i < numberOfStudents; i++) {
            // run loop through each subject (Physics, Chemistry, Math)
            for (int j = 0; j < 3; j++) {
                scores[i][j] = rand.nextInt(91) + 10;  // generate random numbers between 10 and 100 for each subject
            }
        }
        return scores;  // return the generated scores
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateTotalAveragePercentage(int[][] scores, int numberOfStudents) {
        double[][] results = new double[numberOfStudents][4];  // create a 2D array to store total, average, and percentage
        // run loop through each student
        for (int i = 0; i < numberOfStudents; i++) {
            double total = 0;  // initialize total score for the student
            // run loop through each subject to calculate the total score
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];  // add subject score to total
            }
            double average = total / 3;  // calculate average by dividing total by number of subjects
            double percentage = (total / 300) * 100;  // calculate percentage (total score / max score 300 * 100)

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }
        return results;  // return the results array containing total, average, and percentage
    }

    // Method to calculate grades and remarks based on percentage
    public static String[][] calculateGrades(double[][] results, int numberOfStudents) {
        String[] grades = new String[numberOfStudents];  // create an array to store grades for each student
        String[] remarks = new String[numberOfStudents];  // create an array to store remarks for each student

        // loop through each student to print the grade and remarks based on percentage
        for (int i = 0; i < numberOfStudents; i++) {
            double percentage = results[i][2];

            // determine the grade and remarks based on the percentage
            if (percentage >= 80) {
                grades[i] = "A";
                remarks[i] = "(Level 4, above agency-normalized standards)";
            } else if (percentage >= 70) {
                grades[i] = "B";
                remarks[i] = "(Level 3, at agency-normalized standards)";
            } else if (percentage >= 60) {
                grades[i] = "C";
                remarks[i] = "(Level 2, below, but approaching agency-normalized standards)";
            } else if (percentage >= 50) {
                grades[i] = "D";
                remarks[i] = "(Level 1, well below agency-normalized standards)";
            } else if (percentage >= 40) {
                grades[i] = "E";
                remarks[i] = "(Level 1-, too below agency-normalized standards, remedial standards)";
            } else {
                grades[i] = "F";
                remarks[i] = "(Fail)";
            }
        }

        // Returning both grades and remarks as a 2D array
        return new String[][]{grades, remarks};
    }

    // Method to display the scorecard
    public static void displayScoreCard(int[][] scores, double[][] results, String[] grades, String[] remarks, int numberOfStudents) {
        // print header of the scorecard with columns
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("| Student | Physics | Chemistry | Math | Total | Average | Percentage | Grade | Remarks |");
        System.out.println("--------------------------------------------------------------------------------------------");

        // run loop through each student to display their scorecard
        for (int i = 0; i < numberOfStudents; i++) {
            // print the student's scores, total, average, percentage, grade, and remarks
            System.out.print("| " + (i + 1) + " | ");
            System.out.print(scores[i][0] + " | ");
            System.out.print(scores[i][1] + " | ");
            System.out.print(scores[i][2] + " | ");
            System.out.print(Math.round(results[i][0]) + " | ");
            System.out.print(Math.round(results[i][1]) + " | ");
            System.out.print(Math.round(results[i][2]) + " | ");
            System.out.print(grades[i] + " | ");
            System.out.println(remarks[i] + " |");
        }
        System.out.println("--------------------------------------------------------------------------------------------");  // print footer line
    }

    public static void main(String[] args) {
        int numberOfStudents = 5;  // set the number of students

        // Generate random scores for students
        int[][] scores = generateScores(numberOfStudents);

        // Calculate total, average, and percentage
        double[][] results = calculateTotalAveragePercentage(scores, numberOfStudents);

        // Calculate grades and remarks
        String[][] gradesAndRemarks = calculateGrades(results, numberOfStudents);
        String[] grades = gradesAndRemarks[0];  // Extract grades
        String[] remarks = gradesAndRemarks[1];  // Extract remarks

        // print the result
        displayScoreCard(scores, results, grades, remarks, numberOfStudents);
    }  
}
