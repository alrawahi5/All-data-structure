import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
public class PMC3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the measurement string:");
        String userInput = scanner.nextLine();
        scanner.close();
        // Call the measurementConverter method to convert the input string
        List<Integer> convertedValues = PMC3.measurmentconverter(userInput.toLowerCase());
        // Print the input string  with the converted values
        System.out.println("Input: " + userInput + " =>  Measurement : " + convertedValues);

    }

    // Method to convert the measurement string into numerical values
    public static List<Integer> measurmentconverter(String convertString) {
        List<Integer> convertedValues = new ArrayList<>();
        Integer inputLength = convertString.length();
        int currentIndex = 0; // This index is just a pointer
        while (currentIndex < inputLength) {
            char currentCharacter = convertString.charAt(currentIndex);
            int currentValueNum = 0;
            if (currentCharacter >= 'a' && currentCharacter <= 'z') {
                int numOfNextCharsToCount = (currentCharacter - 'a') + 1;
                currentIndex++;
                String sequence = "";
                boolean zEncountered = false; // Flag to track if 'z' is encountered within the sequence
                for (int i = 0; (i < numOfNextCharsToCount) && (currentIndex < inputLength); i++) {
                    char charToCount = convertString.charAt(currentIndex++);
                    if (charToCount == 'z') {
                        sequence = sequence + charToCount;
                        // Count consecutive 'z' characters and the next character
                        while (currentIndex < inputLength && convertString.charAt(currentIndex) == 'z') {
                            sequence = sequence + convertString.charAt(currentIndex++);
                        }
                        if (currentIndex < inputLength) {
                            sequence = sequence + convertString.charAt(currentIndex++);
                        }
                    } else if ((charToCount >= 'a' && charToCount <= 'z') || isNonAlphabetical(charToCount)) {
                        sequence = sequence + charToCount;
                        zEncountered = false;
                    } else {
                        currentIndex--; // Move back one step to process the non-alphabetical character again
                        break;
                    }
                }
                // Calculate value for the sequence if 'z' is not encountered or if it's the last character of the sequence
                if (!zEncountered || sequence.charAt(sequence.length() - 1) == 'z') {
                    convertedValues.add(calculateValue(sequence));
                }
            } else {
                currentIndex++;
            }
        }
        return convertedValues;
    }

    /**
     * Method nonAlphaatical checker
     */
    public static boolean isNonAlphabetical(char character) {
        return "@!#$%^&*()_<>{}[]".indexOf(character) != -1;
    }

    /**
     * Calculates the value of the given input string.
     */
    public static int calculateValue(String input) {
        int value = 0;
        for (char letter : input.toCharArray()) {
            if (letter >= 'a' && letter <= 'z') {
                value = value + (letter - 'a' + 1);
            }
        }
        return value;
    }
}
