package w04CodingProject;

public class Week04CodingProject {

	public static void main(String[] args) {
		 // Task 1
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
        
        // 1.a
        int result = ages[ages.length - 1] - ages[0];
        System.out.println("Result of subtraction (ages array): " + result);

        // 1.b
        int[] ages2 = new int[9];
        for (int i = 0; i < ages2.length; i++) {
            ages2[i] = i * 10; // Example values
        }
        int resultAges2 = ages2[ages2.length - 1] - ages2[0];
        System.out.println("Result of subtraction (ages2 array): " + resultAges2);

        // 1.c
        double averageAge = calculateAverage(ages);
        System.out.println("Average age: " + averageAge);

        // Task 2
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        
        // 2.a
        double averageLetters = calculateAverageLetters(names);
        System.out.println("Average number of letters per name: " + averageLetters);

        // 2.b
        String concatenatedNames = concatenateNames(names);
        System.out.println("Concatenated names: " + concatenatedNames);

        // Task 3 & 4
        // Accessing last element
        int lastElement = ages[ages.length - 1];
        // Accessing first element
        int firstElement = ages[0];

        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);

        // Task 5
        int[] nameLengths = new int[names.length];
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }

        // Task 6
        int sumNameLengths = calculateSum(nameLengths);
        System.out.println("Sum of name lengths: " + sumNameLengths);

        // Task 7
        System.out.println(concatenateWord("Hello", 3)); // Outputs: HelloHelloHello

        // Task 8
        System.out.println(getFullName("John", "Doe")); // Outputs: John Doe

        // Task 9
        int[] numbers = {50, 60, 10};
        System.out.println("Sum greater than 100: " + isSumGreaterThan100(numbers)); // Outputs: true

        // Task 10
        double[] doubleNumbers = {10.5, 20.0, 30.5};
        System.out.println("Average: " + calculateAverage(doubleNumbers)); // Outputs: Average: 20.333...

        // Task 11
        double[] array1 = {10.5, 20.0, 30.5};
        double[] array2 = {5.0, 15.0, 25.0};
        System.out.println("First array average greater: " + isFirstArrayAverageGreater(array1, array2)); // Outputs: true

        // Task 12
        System.out.println(willBuyDrink(true, 15.00)); // Outputs: true
        System.out.println(willBuyDrink(false, 15.00)); // Outputs: false

        // Task 13
        System.out.println(toUpperCase("hello world")); // Outputs: HELLO WORLD
    }

    // Helper Methods
    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    public static double calculateAverage(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static double calculateAverageLetters(String[] names) {
        int totalLetters = 0;
        for (String name : names) {
            totalLetters += name.length();
        }
        return (double) totalLetters / names.length;
    }

    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static String concatenateNames(String[] names) {
        StringBuilder concatenatedNames = new StringBuilder();
        for (String name : names) {
            concatenatedNames.append(name).append(" ");
        }
        return concatenatedNames.toString().trim();
    }

    public static String concatenateWord(String word, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(word);
        }
        return sb.toString();
    }

    public static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public static boolean isSumGreaterThan100(int[] array) {
        return calculateSum(array) > 100;
    }

    public static boolean isFirstArrayAverageGreater(double[] array1, double[] array2) {
        return calculateAverage(array1) > calculateAverage(array2);
    }

    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        return isHotOutside && moneyInPocket > 10.50;
    }

    public static String toUpperCase(String sentence) {
        return sentence.toUpperCase();
        

	}

}
