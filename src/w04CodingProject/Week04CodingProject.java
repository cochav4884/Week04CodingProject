package w04CodingProject;

public class Week04CodingProject {

	public static void main(String[] args) {
		 // Task 1 Create an array of int called ages
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
        
        // 1.a Programmatically subtract the value of the first element in the array from the value in the last element of the array
        int result = ages[ages.length - 1] - ages[0];
        System.out.println("Result of subtraction (ages array): " + result);

        // 1.b Create a new array of int called ages2
        int[] ages2 = new int[9];
        for (int i = 0; i < ages2.length; i++) {
            ages2[i] = i * 10; // Example values
        }
        int resultAges2 = ages2[ages2.length - 1] - ages2[0];
        System.out.println("Result of subtraction (ages2 array): " + resultAges2);

        // 1.c Use a loop to iterate through the array and calculate the average age
        double averageAge = calculateAverage(ages);
        System.out.println("Average age: " + averageAge);

        // Task 2 Create an array of String called names
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        
        // 2.a Use a loop to iterate through the array and calculate the average number of letters per name
        double averageLetters = calculateAverageLetters(names);
        System.out.println("Average number of letters per name: " + averageLetters);

        // 2.b Use a loop to iterate through the array again and concatenate all the names together, separated by spaces
        String concatenatedNames = concatenateNames(names);
        System.out.println("Concatenated names: " + concatenatedNames);

        // Task 3
        // Accessing last element
        int lastElement = ages[ages.length - 1];
        // Task 4
        // Accessing first element
        int firstElement = ages[0];

        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);

        // Task 5 Create a new array of int called nameLengths
        int[] nameLengths = new int[names.length];
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }

        // Task 6 Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array
        int sumNameLengths = calculateSum(nameLengths);
        System.out.println("Sum of name lengths: " + sumNameLengths);

        // Task 7 Write a method that takes a String, word, and int, n, as arguments and returns the word concatenated to itself n number of times
        System.out.println(concatenateWord("Hello", 3)); // Outputs: HelloHelloHello

        // Task 8 Write a method that takes tw3o Strings, firstName and lastName, and returns a full name
        System.out.println(getFullName("John", "Doe")); // Outputs: John Doe

        // Task 9 Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100
        int[] numbers = {50, 60, 10};
        System.out.println("Sum greater than 100: " + isSumGreaterThan100(numbers)); // Outputs: true

        // Task 10 Write a method that takes an array of double and returns the average of all the elements in the array
        double[] doubleNumbers = {10.5, 20.0, 30.5};
        System.out.println("Average: " + calculateAverage(doubleNumbers)); // Outputs: Average: 20.333...

        // Task 11 Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater
        // than the average of the elements in the second array
        double[] array1 = {10.5, 20.0, 30.5};
        double[] array2 = {5.0, 15.0, 25.0};
        System.out.println("First array average greater: " + isFirstArrayAverageGreater(array1, array2)); // Outputs: true

        // Task 12 Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true
        //if it is hot outside and if moneyInPocket is greater than 10.50
        System.out.println(willBuyDrink(true, 15.00)); // Outputs: true
        System.out.println(willBuyDrink(false, 15.00)); // Outputs: false

        // Task 13 Create a method of your own that solves a problem
        System.out.println(toUpperCase("corinne padilla")); // Outputs: CORINNE PADILLA
    }

    // Methods 
	//For Task 1
    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }
    //For Task 2
    public static double calculateAverage(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }
    //For Task 5
    public static double calculateAverageLetters(String[] names) {
        int totalLetters = 0;
        for (String name : names) {
            totalLetters += name.length();
        }
        return (double) totalLetters / names.length;
    }
    //For Task 6
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
  //For Task 7
    public static String concatenateNames(String[] names) {
        StringBuilder concatenatedNames = new StringBuilder();
        for (String name : names) {
            concatenatedNames.append(name).append(" ");
        }
        return concatenatedNames.toString().trim();
    }
  //For Task 8
    public static String concatenateWord(String word, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(word);
        }
        return sb.toString();
    }
  //For Task 9
    public static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
  //For Task 10
    public static boolean isSumGreaterThan100(int[] array) {
        return calculateSum(array) > 100;
    }
  //For Task 11
    public static boolean isFirstArrayAverageGreater(double[] array1, double[] array2) {
        return calculateAverage(array1) > calculateAverage(array2);
    }
  //For Task 12
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        return isHotOutside && moneyInPocket > 10.50;
    }
  //For Task 13
    public static String toUpperCase(String sentence) {
        return sentence.toUpperCase();
        

	}

}
