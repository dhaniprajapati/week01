import java.util.Random; // Import the Random class for generating random numbers

public class RandomNumberAnalysisMethod 
{

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            // Generate a random 4-digit number (1000 to 9999)
            randomNumbers[i] = 1000 + random.nextInt(9000);
        }

        return randomNumbers; // Return the array of random numbers
    }

    // Method to find average, min, and max value of an array
    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = Integer.MAX_VALUE; // Initialize min to the maximum possible value
        int max = Integer.MIN_VALUE; // Initialize max to the minimum possible value

        for (int number : numbers) {
            sum += number; // Calculate the sum
            min = Math.min(min, number); // Update min
            max = Math.max(max, number); // Update max
        }

        double average = sum / numbers.length; // Calculate average
        return new double[]{average, min, max}; // Return average, min, and max
    }

    public static void main(String[] args) {
        int size = 5; // Number of random values to generate
        int[] randomNumbers = generate4DigitRandomArray(size); // Generate random numbers

        // Display the generated random numbers
        System.out.println("Generated 4-digit random numbers:");
        for (int number : randomNumbers) {
            System.out.println(number);
        }

        // Find average, min, and max values
        double[] results = findAverageMinMax(randomNumbers);
        double average = results[0];
        int min = (int) results[1];
        int max = (int) results[2];

        // Display the results
        System.out.printf("Average: " +average);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}